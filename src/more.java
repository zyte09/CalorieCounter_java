import java.util.Scanner;
import java.text.DecimalFormat;
public class more {
    private final mealTracker mealTracker;
    private final Scanner input = new Scanner(System.in);
    private final program prog;

    public more(mealTracker mealTracker, program prog){
        this.mealTracker = mealTracker;
        this.prog = prog;
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
                        System.out.println("Exiting more menu...");
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
                System.out.println("Exiting nutrition...");
                return;
            default:
                System.out.println("Please enter a valid choice");
        }
    }
    public void trainingInfo(){
        System.out.println("============ Training Info ============");
        System.out.println("1. Fitness Level: " + prog.getFitnessLevel());
        System.out.println("2. Training Goal: " + prog.getTrainingGoal());
        System.out.println("3. Training Frequency: " + prog.getTrainingFrequency());
        System.out.println("4. Training Split: " + prog.getTrainingSplit());
        System.out.println("5. Training Volume: " + prog.getTrainingVolume());
        System.out.println("6. Exit");
        System.out.println("=======================================");
        System.out.println("Select the number of the info you want to update (1-6): ");
        int option = input.nextInt();
        switch (option){
            case 1:
                System.out.println("1. Beginner (Less than 6 months of experience)");
                System.out.println("2. Intermediate (6 months - 1 year of experience)");
                System.out.println("3. Advanced (More than 1 year of experience)");
                System.out.println("Enter your new fitness level (1-3): ");
                int fitnessLevelchoice = input.nextInt();
                switch (fitnessLevelchoice) {
                    case 1:
                        prog.setFitnessLevel("Beginner (Less than 6 months of experience)");
                        break;
                    case 2:
                        prog.setFitnessLevel("Intermediate (6 months - 1 year of experience)");
                        break;
                    case 3:
                        prog.setFitnessLevel("Advanced (More than 1 year of experience)");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                }
                break;
            case 2:
                System.out.println("Enter your new training goal: ");
                System.out.println("1. Strength");
                System.out.println("2. Hypertrophy (Muscle Growth)");
                System.out.println("3. Endurance");
                System.out.println("Enter your choice: ");
                int trainingGoalchoice = input.nextInt();
                input.nextLine();
                switch(trainingGoalchoice) {
                    case 1:
                        prog.setTrainingGoal("Strength");
                        break;
                    case 2:
                        prog.setTrainingGoal("Hypertrophy (Muscle Growth)");
                        break;
                    case 3:
                        prog.setTrainingGoal("Endurance");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                }
                break;
            case 3:
                System.out.println("Enter your new training frequency: ");
                System.out.println("1. 3 days per week");
                System.out.println("2. 4 days per week");
                System.out.println("3. 5 days per week");
                System.out.println("4. 6 days per week");
                System.out.println("5. 7 days per week");
                System.out.println("Enter your choice (1-5): ");
                int trainingFrequencychoice = input.nextInt();
                input.nextLine();
                switch(trainingFrequencychoice) {
                    case 1:
                        prog.setTrainingFrequency("3 days per week");
                        break;
                    case 2:
                        prog.setTrainingFrequency("4 days per week");
                        break;
                    case 3:
                        prog.setTrainingFrequency("5 days per week");
                        break;
                    case 4:
                        prog.setTrainingFrequency("6 days per week");
                        break;
                    case 5:
                        prog.setTrainingFrequency("7 days per week");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
                break;
            case 4:
                System.out.println("Enter your new training split: ");
                System.out.println("1. Upper/Lower Split");
                System.out.println("2. Push/Pull/Legs Split");
                System.out.println("3. Full Body Split");
                System.out.println("Enter your choice (1-3): ");
                int trainingSplitchoice = input.nextInt();
                input.nextLine();
                switch(trainingSplitchoice) {
                    case 1:
                        prog.setTrainingSplit("Upper/Lower Split");
                        break;
                    case 2:
                        prog.setTrainingSplit("Push/Pull/Legs Split");
                        break;
                    case 3:
                        prog.setTrainingSplit("Full Body Split");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                }
                break;
            case 5:
                System.out.println("Enter your new training volume: ");
                System.out.println("1. Low volume (3-6 sets per muscle group)");
                System.out.println("2. Moderate volume (7-9 sets per muscle group)");
                System.out.println("3. High volume (10+ sets per muscle group)");
                System.out.println("Enter your choice (1-3): ");
                int trainingVolumechoice = input.nextInt();
                input.nextLine();
                switch(trainingVolumechoice) {
                    case 1:
                        prog.setTrainingVolume("Low volume (3-6 sets per muscle group)");
                        break;
                    case 2:
                        prog.setTrainingVolume("Moderate volume (7-9 sets per muscle group)");
                        break;
                    case 3:
                        prog.setTrainingVolume("High volume (10+ sets per muscle group)");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                }
                break;
            case 6:
                System.out.println("Exiting training info...");
                return;
            default:
                System.out.println("Please enter a valid choice");
        }
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
