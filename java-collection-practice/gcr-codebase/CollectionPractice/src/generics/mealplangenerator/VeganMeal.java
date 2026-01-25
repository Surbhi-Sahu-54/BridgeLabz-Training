package generics.mealplangenerator;

public class VeganMeal implements MealPlan {
    private String breakfast;
    private String lunch;
    private String dinner;

    public VeganMeal(String breakfast, String lunch, String dinner) {
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
    }

    public String getPlanType() {
        return "Vegan";
    }

    public void displayPlan() {
        System.out.println("Meal Plan Type: Vegan");
        System.out.println("Breakfast: " + breakfast);
        System.out.println("Lunch: " + lunch);
        System.out.println("Dinner: " + dinner);
    }
}
