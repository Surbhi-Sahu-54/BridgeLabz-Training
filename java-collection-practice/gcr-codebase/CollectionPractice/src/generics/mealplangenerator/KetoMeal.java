package generics.mealplangenerator;

public class KetoMeal implements MealPlan {
    private String breakfast;
    private String lunch;
    private String dinner;

    public KetoMeal(String breakfast, String lunch, String dinner) {
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
    }

    public String getPlanType() {
        return "Keto";
    }

    public void displayPlan() {
        System.out.println("Meal Plan Type: Keto");
        System.out.println("Breakfast: " + breakfast);
        System.out.println("Lunch: " + lunch);
        System.out.println("Dinner: " + dinner);
    }
}
