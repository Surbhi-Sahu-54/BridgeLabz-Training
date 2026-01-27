package generics.mealplangenerator;

public class VegetarianMeal implements MealPlan {
    private String breakfast;
    private String lunch;
    private String dinner;

    public VegetarianMeal(String breakfast, String lunch, String dinner) {
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
    }

    public String getPlanType() {
        return "Vegetarian";
    }

    public void displayPlan() {
        System.out.println("Meal Plan Type: Vegetarian");
        System.out.println("Breakfast: " + breakfast);
        System.out.println("Lunch: " + lunch);
        System.out.println("Dinner: " + dinner);
    }
}
