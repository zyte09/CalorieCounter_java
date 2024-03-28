import java.util.Scanner;
import java.util.HashMap;
import java.text.DecimalFormat;

public class mealTracker {
    HashMap<String, Meal> meals = new HashMap<>();
    FoodDatabase foodDatabase = new FoodDatabase();
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
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }
    }

    public void addMeal() {
        Scanner input = new Scanner(System.in);

        int mealType = 0;
        String mealName = "";
        while (mealType < 1 || mealType > 4) {
            System.out.println("Select a meal type:");
            System.out.println("1. Breakfast");
            System.out.println("2. Lunch");
            System.out.println("3. Dinner");
            System.out.println("4. Snack");
            System.out.println("Enter your choice: ");
            if (input.hasNextInt()) {
                mealType = input.nextInt();
                if (mealType < 1 || mealType > 4) {
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                } else {
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
                    }
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.next();
            }
        }
        input.nextLine();


        System.out.println("You selected: " + mealName);

        System.out.println("Enter the name of the food to search: ");
        String searchName = input.nextLine().toLowerCase();
        while (!foodDatabase.hasMealInfo(searchName)) {
            System.out.println("Food not found in database.");
            System.out.println("Enter the name of the food to search: ");
            searchName = input.nextLine().toLowerCase();
        }
        System.out.println("Enter the serving size (in grams): ");
        double servingSize = 0;
        while (!input.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            input.next();
        }
        servingSize = input.nextDouble();
        input.nextLine();

        if (foodDatabase.hasMealInfo(searchName)) {
            MealInfo mealInfo = foodDatabase.getMealInfo(searchName);
            mealInfo.scaleNutritionalValues(servingSize);
        } else {
            System.out.println("Food not found in database.");
        }

        Meal meal = new Meal(mealName, searchName, servingSize);
        meals.put(mealName, meal);
    }


    public void displayAllMeals() {
        DecimalFormat df = new DecimalFormat("#.##");
        if (meals.isEmpty()) {
            System.out.println("No meals to display.");
        } else {
            for (Meal meal : meals.values()) {
                System.out.println("\nMeal Name: " + meal.mealName);
                System.out.println("Food Name: " + meal.foodName);
                System.out.println("Serving Size: " + meal.servingSize);
                if (foodDatabase.hasMealInfo(meal.foodName)) {
                    MealInfo mealInfo = foodDatabase.getMealInfo(meal.foodName);
                    System.out.println("Calories: " + df.format(mealInfo.calories));
                    System.out.println("Carbs: " + df.format(mealInfo.carbs));
                    System.out.println("Fats: " + df.format(mealInfo.fats));
                    System.out.println("Protein: " + df.format(mealInfo.protein));
                } else {
                    System.out.println("Nutritional information not found in database.");
                }
            }
        }
    }

    public void deleteMeal() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the meal to delete: ");
        String mealName = input.nextLine();

        if(meals.containsKey(mealName)){
            meals.remove(mealName);
            System.out.println("Meal deleted");
        } else {
            System.out.println("Meal not found");
        }
    }

    public void updateMeal() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the meal to update: ");
        String mealName = input.nextLine();
        System.out.println("Enter the new serving size: ");
        if(!input.hasNextDouble()){
            System.out.println("Invalid input. Please enter a number.");
            input.next();
            return;
        }
        double newServingSize = input.nextDouble();

        Meal meal = meals.get(mealName);
        if (meal != null) {
            meal.servingSize = newServingSize;
        } else {
            System.out.println("Meal not found");
        }
    }
}