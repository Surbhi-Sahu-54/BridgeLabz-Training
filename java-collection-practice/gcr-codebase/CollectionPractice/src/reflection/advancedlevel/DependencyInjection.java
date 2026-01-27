package reflection.advancedlevel;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}

class Service {
    public void perform() {
        System.out.println("Service is running...");
    }
}

class Client {
    @Inject
    private Service service;

    public void useService() {
        service.perform();
    }
}

public class DependencyInjection {

    private final Map<Class<?>, Object> instances = new HashMap<>();

    public void register(Class<?> clazz) throws Exception {
        instances.put(clazz, clazz.getDeclaredConstructor().newInstance());
    }

    public void injectDependencies(Object obj) throws Exception {
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                field.set(obj, instances.get(field.getType()));
            }
        }
    }

    public static void main(String[] args) throws Exception {
        DependencyInjection di = new DependencyInjection();
        di.register(Service.class);

        Client client = new Client();
        di.injectDependencies(client);
        client.useService();
    }
}

