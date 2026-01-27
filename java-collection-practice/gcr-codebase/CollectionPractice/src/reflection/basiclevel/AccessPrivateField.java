package reflection.basiclevel;

import java.lang.reflect.Field;

class Person {
    private int age = 22 ;
}
public class AccessPrivateField {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Class<?> cls = person.getClass();  //Getting class object

        // Accessing private field age
        Field field = cls.getDeclaredField("age");

        field.setAccessible(true); // Allowing access to private field

        // Get field value
        System.out.println("Old age: " + field.get(person));

        // Modifying field value
        field.set(person, 30);

        // Getting modified value
        System.out.println("New Value: " + field.get(person));
    }
}