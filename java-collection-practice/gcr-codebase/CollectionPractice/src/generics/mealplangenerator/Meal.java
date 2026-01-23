package generics.mealplangenerator;
import java.util.*;

public class Meal<T extends MealPlan> {
    private ArrayList<T> plans = new ArrayList<>();

    public void addPlan(T plan) {
        plans.add(plan);
        System.out.println("Meal plan added.");
    }

    public void displayAllPlans() {
        if (plans.size() == 0) {
            System.out.println("No meal plans available.");
            return;
        }

        for (T p : plans) {
            p.displayPlan();
            System.out.println("----------------------");
        }
    }

    public ArrayList<T> getPlans() {
        return plans;
    }
}
