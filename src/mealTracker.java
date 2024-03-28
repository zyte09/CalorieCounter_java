import java.util.Scanner;
import java.util.HashMap;
public class mealTracker {
    private FoodDatabase foodDatabase;

    public mealTracker() {
        this.foodDatabase = new FoodDatabase();
    }

    public void displaymealTracker() {
        System.out.println("Welcome to the meal tracker");
        System.out.println("What would you like to do today?");
        System.out.println("1. Add a new meal");
        System.out.println("2. Display all meals");
        System.out.println("3. Delete a meal");
        System.out.println("4. Update a meal");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                addMeal();
                break;
            case 2:
                displayAllMeals();
                break;
            case 3:
                deleteMeal();
                break;
            case 4:
                updateMeal();
                break;
            case 5:
                System.out.println("Exiting meal tracker....");
                System.exit(0);
                break;
            default:
                System.out.println("Please enter a valid choice");
        }
    }

    public void addMeal() {
        Scanner input = new Scanner(System.in);

        System.out.println("Select a meal type:");
        System.out.println("1. Breakfast");
        System.out.println("2. Lunch");
        System.out.println("3. Dinner");
        System.out.println("4. Snack");
        System.out.println("Enter your choice: ");
        int mealType = input.nextInt();
        input.nextLine();
        String mealName = "";
        switch (mealType) {
            case 1:
                mealName = "Breakfast";
                break;
            case 2:
                mealName = "Lunch";
                break;
            case 3:
                mealName = "Dinner";
                break;
            case 4:
                mealName = "Snack";
                break;
            default:
                System.out.println("Please enter a valid choice");
        }

        System.out.println("You selected: " + mealName);

        System.out.println("Enter the name of the food to search: ");
        String searchName = input.nextLine().toLowerCase();
        System.out.println("Enter the serving size (in grams): ");
        double servingSize = input.nextDouble();
        input.nextLine();
        foodDatabase.addMeal(searchName, servingSize);
    }

    public void displayAllMeals() {
        foodDatabase.displayAllMeals();
    }

    public void deleteMeal() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the meal to delete: ");
        String mealName = input.nextLine();
        foodDatabase.deleteMeal(mealName);
    }

    public void updateMeal() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the meal to update: ");
        String mealName = input.nextLine();
        System.out.println("Enter the new serving size: ");
        double newServingSize = input.nextDouble();
        foodDatabase.updateMeal(mealName, newServingSize);
    }
}