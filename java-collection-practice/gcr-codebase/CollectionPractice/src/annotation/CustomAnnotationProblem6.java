/*
6️⃣ Implement a Custom Serialization Annotation @JsonField
✅ Problem Statement:
Define an annotation @JsonField to mark fields for JSON serialization.
🔹 Requirements:
@JsonField(name = "user_name") should map field names to custom JSON keys.
Apply it on a User class.
Write a method to convert object to JSON string by reading the annotations.

 */

package annotation;
import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

// Step 1Define @JsonField Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name(); // Custom JSON key
}

// Step 2: Create User Class with Annotated Fields
class Agent {
    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "email_id")
    private String email;

    private int age; // Not annotated, should be ignored

    public Agent(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
}

// Converting Object to JSON Using Reflection
class JsonSerializer {
    public static String serialize(Object obj) {
        Map<String, String> jsonMap = new HashMap<>();

        try {
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                if (field.isAnnotationPresent(JsonField.class)) {
                    String jsonKey = field.getAnnotation(JsonField.class).name();
                    jsonMap.put(jsonKey, field.get(obj).toString());
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return jsonMap.toString().replace("=", ": ").replace(",", ",\n");
    }
}

public class CustomAnnotationProblem6 {
    public static void main(String[] args) {
        Agent agent = new Agent("James", "bond007@raw.in", 25);
        String jsonString = JsonSerializer.serialize(agent);
        System.out.println(jsonString);
    }
}