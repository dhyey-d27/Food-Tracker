import java.util.ArrayList;
import java.util.Scanner;

public class FoodTracker {
    static ArrayList<String> mealNames = new ArrayList<String>();
    static ArrayList<Integer> mealCalories = new ArrayList<Integer>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;

        while (choice != 3) {
            System.out.println("\n=== Food Tracker ===\n");
            System.out.println("1. Log a meal\n");
            System.out.println("2. View Meals\n");
            System.out.println("3. Exit\n");
            System.out.println("Choose: \n");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                logMeal();
            }

            else if (choice == 2) {
                viewMeals();
            }

            else if (choice == 3) {
                System.out.println("Goodbye");
            }

            else {
                System.out.println("Please enter 1, 2, or 3.");
            }
        }
    }

    public static void logMeal() {
        System.out.print("\nFood Name: ");
        String name = sc.nextLine();

        System.out.print("\nCalories: ");
        int cal = sc.nextInt();
        sc.nextLine();

        mealNames.add(name);
        mealCalories.add(cal);

        System.out.println("\nLogged: " + name + " - " + cal + " calories");
    }

    public static void viewMeals() {
        if (mealNames.isEmpty()) {
            System.out.println("\nNo meals logged yet.");
            return;
        }

        int total = 0;
        System.out.println("\nMeals logged: ");

        for (int i = 0; i < mealNames.size(); i++) {
            System.out.println("\n  " + (i + 1) + ". " + mealNames.get(i) + " - " + mealCalories.get(i) + " cal");
            total += mealCalories.get(i);
        }

        System.out.println("\nTotal: " + total + " calories");
    }

}