package generics.mealplangenerator;

public class HighProteinMeal implements MealPlan {
    private String breakfast;
    private String lunch;
    private String dinner;

    public HighProteinMeal(String breakfast, String lunch, String dinner) {
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
    }

    public String getPlanType() {
        return "High-Protein";
    }

    public void displayPlan() {
        System.out.println("Meal Plan Type: High-Protein");
        System.out.println("Breakfast: " + breakfast);
        System.out.println("Lunch: " + lunch);
        System.out.println("Dinner: " + dinner);
    }
}
