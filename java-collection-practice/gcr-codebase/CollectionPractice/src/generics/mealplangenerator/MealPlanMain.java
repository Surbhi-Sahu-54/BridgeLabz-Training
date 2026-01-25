package generics.mealplangenerator;
import java.util.*;

public class MealPlanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Meal<VegetarianMeal> vegList = new Meal<>();
        Meal<VeganMeal> veganList = new Meal<>();
        Meal<KetoMeal> ketoList = new Meal<>();
        Meal<HighProteinMeal> hpList = new Meal<>();

        while (true) {
            System.out.println("\nPersonalized Meal Plan Generator");
            System.out.println("1. Generate Vegetarian Plan");
            System.out.println("2. Generate Vegan Plan");
            System.out.println("3. Generate Keto Plan");
            System.out.println("4. Generate High-Protein Plan");
            System.out.println("5. Display All Plans");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter Breakfast: ");
                String b = sc.nextLine();

                System.out.print("Enter Lunch: ");
                String l = sc.nextLine();

                System.out.print("Enter Dinner: ");
                String d = sc.nextLine();

                VegetarianMeal plan = new VegetarianMeal(b, l, d);
                vegList.addPlan(plan);
                MealPlanUtil.validateAndGenerate(plan);

            } else if (ch == 2) {
                System.out.print("Enter Breakfast: ");
                String b = sc.nextLine();

                System.out.print("Enter Lunch: ");
                String l = sc.nextLine();

                System.out.print("Enter Dinner: ");
                String d = sc.nextLine();

                VeganMeal plan = new VeganMeal(b, l, d);
                veganList.addPlan(plan);
                MealPlanUtil.validateAndGenerate(plan);

            } else if (ch == 3) {
                System.out.print("Enter Breakfast: ");
                String b = sc.nextLine();

                System.out.print("Enter Lunch: ");
                String l = sc.nextLine();

                System.out.print("Enter Dinner: ");
                String d = sc.nextLine();

                KetoMeal plan = new KetoMeal(b, l, d);
                ketoList.addPlan(plan);
                MealPlanUtil.validateAndGenerate(plan);

            } else if (ch == 4) {
                System.out.print("Enter Breakfast: ");
                String b = sc.nextLine();

                System.out.print("Enter Lunch: ");
                String l = sc.nextLine();

                System.out.print("Enter Dinner: ");
                String d = sc.nextLine();

                HighProteinMeal plan = new HighProteinMeal(b, l, d);
                hpList.addPlan(plan);
                MealPlanUtil.validateAndGenerate(plan);

            } else if (ch == 5) {
                System.out.println("\nVegetarian Plans:");
                vegList.displayAllPlans();

                System.out.println("\nVegan Plans:");
                veganList.displayAllPlans();

                System.out.println("\nKeto Plans:");
                ketoList.displayAllPlans();

                System.out.println("\nHigh-Protein Plans:");
                hpList.displayAllPlans();

            } else if (ch == 6) {
                System.out.println("Exit");
                break;

            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}

