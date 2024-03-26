import java.util.Scanner;
public class mealTracker {
    public void displaymealTracker(){
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
    public void addMeal(){
        System.out.println("You want to add a meal");
        System.out.println("Please enter a valid choice");
        System.out.println("1. Breakfast");
        System.out.println("2. Lunch");
        System.out.println("3. Dinner");
        System.out.println("4. Snack");

        Scanner input = new Scanner(System.in);
        int foodChoice = input.nextInt();

        switch (foodChoice) {
            case 1:
                addBreakfast();
                break;
            case 2:
                addLunch();
                break;
            case 3:
                addDinner();
                break;
            case 4:
                addSnack();
                break;
            default:
                System.out.println("Please enter a valid choice");
                break;
        }
    }
    public void addBreakfast(){

    }
    public void addLunch(){
    }
    public void addDinner(){
    }
    public void addSnack(){
    }

    public void displayAllMeals(){
    }
    public void deleteMeal(){
    }
    public void updateMeal(){
    }
}
