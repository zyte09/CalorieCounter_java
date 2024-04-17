import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.text.DecimalFormat;

public class mealTracker {
    HashMap<String, Meal> meals = new HashMap<>();
    FoodDatabase foodDatabase = new FoodDatabase();
    int mealCounter = 0;
    public void displaymealTracker() {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("\nWelcome to the meal tracker");
            System.out.println("What would you like to do today?");
            System.out.println("1. Add a new meal");
            System.out.println("2. Display all meals");
            System.out.println("3. Delete a meal");
            System.out.println("4. Update a meal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            if (input.hasNextInt()) {
                choice = input.nextInt();
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
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.next();
            }
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
            MealInfo originalmealInfo = foodDatabase.getMealInfo(searchName);
            MealInfo scaledMealInfo = new MealInfo(
                    originalmealInfo.getCalories(),
                    originalmealInfo.getCarbs(),
                    originalmealInfo.getFats(),
                    originalmealInfo.getProtein()
            );
            scaledMealInfo.scaleNutritionalValues(servingSize);
            Meal meal = new Meal(mealName, searchName, servingSize, scaledMealInfo); // add meal info to meal constructor
            String key = mealName + " " + searchName + " " + servingSize;
            meals.put(key, meal);
        } else {
            System.out.println("Food not found in database.");
        }
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
                MealInfo mealInfo = meal.getMealInfo();
                System.out.println("Calories: " + df.format(mealInfo.calories));
                System.out.println("Carbs: " + df.format(mealInfo.carbs));
                System.out.println("Fats: " + df.format(mealInfo.fats));
                System.out.println("Protein: " + df.format(mealInfo.protein));
            }
        }
    }

    public void deleteMeal() {
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
        System.out.println("Meal in " + mealName + " to delete: ");
        List<String> mealKeys = new ArrayList<>();
        int i = 1;
        for (String key : meals.keySet()) {
            if (key.contains(mealName)) {
                mealKeys.add(key);
                System.out.println(i + ". " + key.substring(mealName.length() + 1) + " gram/s"); // +1 to remove the space
                i++;
            }
        }

        System.out.println("Enter the name of the meal to delete from " + mealName + ":");
        int mealNumber = input.nextInt() - 1; // to start at 0
        if (mealNumber >= 0 && mealNumber < mealKeys.size()) {
            String key = mealKeys.get(mealNumber);
            meals.remove(key);
            System.out.println("Meal deleted.");
        } else {
            System.out.println("Invalid meal number.");
        }
    }

    public void updateMeal() {
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
        System.out.println("Meal in " + mealName + " to update: ");
        List<String> mealKeys = new ArrayList<>();
        int i = 1;
        for (String key : meals.keySet()) {
            if (key.startsWith(mealName)) {
                Meal meal = meals.get(key);
                System.out.println(i + ". " + key.substring(mealName.length() + 1) + " gram/s"); // +1 to remove the space and display serving size
                mealKeys.add(key);
                i++;
            }
        }

        System.out.println("Enter the number of the meal to update from " + mealName + ":");
        int mealNumber = input.nextInt() - 1; // -1 to get the correct index and to start at 0
        if (mealNumber >= 0 && mealNumber < mealKeys.size()){
            String key = mealKeys.get(mealNumber);
            System.out.print("Enter the new serving size (in grams): ");
            if(!input.hasNextDouble()){
                System.out.println("Invalid input. Please enter a number.");
                input.next();
                return;
            }
            double newServingSize = input.nextDouble();
            Meal meal = meals.get(key);
            MealInfo originalMealInfo = meal.getMealInfo();
            MealInfo scaledMealInfo = new MealInfo(
                    originalMealInfo.getCalories(),
                    originalMealInfo.getCarbs(),
                    originalMealInfo.getFats(),
                    originalMealInfo.getProtein()
            );
            scaledMealInfo.scaleNutritionalValues(newServingSize);
            meal.servingSize = newServingSize;
            meal.mealInfo = scaledMealInfo; // update mealinfo with new values
            System.out.println("Meal updated");
        } else {
            System.out.println("Invalid meal number.");
        }
    }
}