import java.util.Scanner;
import java.text.DecimalFormat;
public class more {
    private final mealTracker mealTracker;
    private final Scanner input = new Scanner(System.in);

    public more(mealTracker mealTracker){
        this.mealTracker = mealTracker;
    }

    public void displayMore(Profile user) {
        int option = 0;
        while (option != 5) {
            System.out.println("\n============ More ============");
            System.out.println("1. Goals");
            System.out.println("2. Nutrition");
            System.out.println("3. Training Info");
            System.out.println("4. Update Profile");
            System.out.println("5. Exit");
            System.out.println("==============================");

            System.out.print("Please select an option (1-5): ");
            if (input.hasNextInt()) {
                option = input.nextInt();
                switch (option) {
                    case 1:
                        goals(user);
                        break;
                    case 2:
                        nutrition(user);
                        break;
                    case 3:
                        trainingInfo();
                        break;
                    case 4:
                        updateProfile(user);
                        break;
                    case 5:
                        System.out.println("Returning to more menu...");
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

    public void goals(Profile user) {
        System.out.println("============ Goals ============");
        System.out.println("1. Update Current Weight");
        System.out.println("2. Update Goal Weight");
        System.out.println("3. Update Activity Level");
        System.out.println("4. Back");
        System.out.println("===============================");

        System.out.print("Please select an option (1-4): ");
        int option = input.nextInt();
        input.nextLine();

        switch(option){
            case 1:
                System.out.println("Enter your new weight(kg): ");
                int weight = input.nextInt();
                user.setWeight(weight);
                break;
            case 2:
                System.out.println("Enter your new goal weight(kg): ");
                int goalWeight = input.nextInt();
                user.setGoalWeight(goalWeight);
                break;
            case 3:
                System.out.println("\nActivity Level");
                System.out.println("1. Sedentary (Office Job)");
                System.out.println("2. Light Exercise (1-2 days/week)");
                System.out.println("3. Moderate Exercise (3-5 days/week)");
                System.out.println("4. Heavy Exercise (6-7 days/week)");
                System.out.println("5. Athlete Exercise (2x per day)");
                System.out.println("Input your choice (1-5): ");
                int activityChoice = input.nextInt();
                String activityLevel = "";

                switch (activityChoice) {
                    case 1:
                        activityLevel = "Sedentary (Office Job)";
                        break;
                    case 2:
                        activityLevel = "Light Exercise (1-2 days/week)";
                        break;
                    case 3:
                        activityLevel = "Moderate Exercise (3-5 days/week)";
                        break;
                    case 4:
                        activityLevel = "Heavy Exercise (6-7 days/week)";
                        break;
                    case 5:
                        activityLevel = "Athlete Exercise (2x per day)";
                        break;
                }
                user.setActivity(activityLevel);
                break;
            case 4:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Please enter a valid choice");
        }
    }

    public void nutrition(Profile user){
        System.out.println("============ Nutrition ============");
        System.out.println("1. Calories");
        System.out.println("2. Nutrition Facts");
        System.out.println("3. Exit");
        System.out.println("===================================");
        System.out.println("Please select an option (1-3): ");
        int option = input.nextInt();
        input.nextLine();

        switch(option){
            case 1:
                displayCalories(user);
                break;
            case 2:
                displayNutritionFacts(user);
                break;
            case 3:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Please enter a valid choice");
        }
    }
    public void trainingInfo(){
        System.out.println("============ Training Info ============");
        System.out.println("1. View Training Information");
        System.out.println("2. Edit Training Information");
        System.out.println("3. Exit");
        System.out.println("=======================================");
    }

    public void updateProfile(Profile user){
        //hghghg
    }

    public void displayCalories(Profile user){
        System.out.println("\n============ Calories ============");
        System.out.println("Breakfast: " + mealTracker.getTotalCalForMeals("Breakfast") + " calories");
        System.out.println("Lunch: " + mealTracker.getTotalCalForMeals("Lunch") + " calories");
        System.out.println("Dinner: " + mealTracker.getTotalCalForMeals("Dinner") + " calories");
        System.out.println("Snacks: " + mealTracker.getTotalCalForMeals("Snacks") + " calories");
        System.out.println("=========================================");
    }

    public void displayNutritionFacts(Profile user){
    //get total nutrients from mealTracker
    double totalProtein = mealTracker.getTotalProtein();
    double totalCarbs = mealTracker.getTotalCarbs();
    double totalFat = mealTracker.getTotalFats();

    //get nutrient goals from user profile
    double proteinGoal = user.getProteinGoal();
    double carbsGoal = user.getCarbsGoal();
    double fatGoal = user.getFatGoal();

    //get remaining nutrients to reach goal
    double proteinLeft = proteinGoal - totalProtein;
    double carbsLeft = carbsGoal - totalCarbs;
    double fatLeft = fatGoal - totalFat;

    DecimalFormat df = new DecimalFormat("#.##");
    //nutrition facts
    System.out.println("\n============ Nutrition Facts ============");
    System.out.println("          Total  |  Goal  |  Left");
    System.out.println("Protein:  " + df.format(totalProtein) + "  |  " + df.format(proteinGoal) + "   |   " + df.format(proteinLeft));
    System.out.println("Carbs:   " + df.format(totalCarbs) + "  |  " + df.format(carbsGoal) + "   |   " + df.format(carbsLeft));
    System.out.println("Fat:     " + df.format(totalFat) + "  |  " + df.format(fatGoal) + "   |   " + df.format(fatLeft));
    System.out.println("=========================================");
}

}
