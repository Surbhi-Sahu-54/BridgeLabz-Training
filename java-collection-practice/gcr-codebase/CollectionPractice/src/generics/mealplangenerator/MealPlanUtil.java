package generics.mealplangenerator;

public class MealPlanUtil {

    public static <T extends MealPlan> void validateAndGenerate(T plan) {
        if (plan == null) {
            System.out.println("Invalid meal plan.");
            return;
        }

        System.out.println("Meal Plan Generated Successfully");
        plan.displayPlan();
    }
}
