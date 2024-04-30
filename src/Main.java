import java.util.Scanner;
public class Main {
    private static final Scanner input = new Scanner(System.in); // global scanner then final para di mabago
    public static void main(String[] args) {
        System.out.println("Welcome to Macro Lite, the Calorie Counter App");
        System.out.println("Please enter your Profile Information");
        //user input profile info
        System.out.println("Enter your name: ");
        String name = input.nextLine();

        //age
        int age = 0;
        while (age <= 0) {
            System.out.println("Enter your age: ");
            if (input.hasNextInt()) {
                age = input.nextInt();
                if (age <= 0) {
                    System.out.println("Please enter a valid age.");
                }
            } else {
                System.out.println("Please enter a valid age.");
                input.next();
            }
        }
        input.nextLine();

        //gender
        String gender = "";
        while (!gender.equalsIgnoreCase("M") && !gender.equalsIgnoreCase("F")) {
            System.out.println("Enter your gender (M/F): ");
            gender = input.nextLine();
            if (!gender.equalsIgnoreCase("M") && !gender.equalsIgnoreCase("F")) {
                System.out.println("Please enter either 'M' or 'F'.");
            }
        }

        //height
        int height = 0;
        while (height <= 0) {
            System.out.println("Enter your height(cm): ");
            if (input.hasNextInt()) {
                height = input.nextInt();
                if (height <= 0) {
                    System.out.println("Please enter a valid height.");
                }
            } else {
                System.out.println("Please enter a valid height.");
                input.next();
            }
        }
        input.nextLine();

        //weight
        int weight = 0;
        while (weight <= 0) {
            System.out.println("Enter your weight(kg): ");
            if (input.hasNextInt()) {
                weight = input.nextInt();
                if (weight <= 0) {
                    System.out.println("Please enter a valid weight.");
                }
            } else {
                System.out.println("Please enter a valid weight.");
                input.next();
            }
        }
        input.nextLine();

        //goal weight
        int goalWeight = 0;
        while (goalWeight <= 0) {
            System.out.println("Enter your goal weight(kg): ");
            if (input.hasNextInt()) {
                goalWeight = input.nextInt();
                if (goalWeight <= 0) {
                    System.out.println("Please enter a valid weight.");
                }
            } else {
                System.out.println("Please enter a valid weight.");
                input.next();
            }
        }
        input.nextLine();

        //activity level
        System.out.println("\nActivity Level");
        System.out.println("1. Sedentary (Office Job)");
        System.out.println("2. Light Exercise (1-2 days/week)");
        System.out.println("3. Moderate Exercise (3-5 days/week)");
        System.out.println("4. Heavy Exercise (6-7 days/week)");
        System.out.println("5. Athlete Exercise (2x per day)");
        System.out.print("Input your choice (1-5): ");
        int activityChoice = 0;
        while (activityChoice < 1 || activityChoice > 5) {
            if (input.hasNextInt()) {
                activityChoice = input.nextInt();
                if (activityChoice < 1 || activityChoice > 5) {
                    System.out.print("Please enter a valid choice (1-5): ");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.next();
            }
        }

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

        System.out.println("\nGoal");
        System.out.println("If you are a beginner, go Maintenance first");
        System.out.println("1. Loss weight (Cutting)");
        System.out.println("2. Maintain weight (Maintenance)");
        System.out.println("3. Gain muscle (Bulking)");
        System.out.print("Input your choice (1-3): ");
        int goalChoice = 0;
        while (goalChoice < 1 || goalChoice > 3) {
            if (input.hasNextInt()) {
                goalChoice = input.nextInt();
                if (goalChoice < 1 || goalChoice > 3) {
                    System.out.print("Please enter a valid choice (1-3): ");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.next();
            }
        }

        String goal = "";
        switch (goalChoice) {
            case 1:
                goal = "Loss weight (Cutting)";
                break;
            case 2:
                goal = "Maintain weight (Maintenance)";
                break;
            case 3:
                goal = "Gain muscle (Bulking)";
                break;
        }


        Profile user = new Profile(name, gender, activityLevel, goal, age, weight, height);
        user.setGoalWeight(goalWeight);
        mealTracker myMealTracker = new mealTracker();
        home home = new home(myMealTracker);
        program program = new program();
        more more = new more();
        //menu
        while (true) {
            displayMenu();
            System.out.print("Please select an option (1-5): ");
            int option = input.nextInt();
            input.nextLine();
            switch(option) {
                case 1:
                    home.displayHome(user);
                    break;
                case 2:
                    myMealTracker.displaymealTracker();
                    break;
                case 3:
                    program.displayProgram();
                    break;
                case 4:
                    more.displayMore(user);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    input.close();
                    return;
                default:
                    System.out.println("Please enter a valid choice");
            }
        }
    }
    public static void displayMenu() {
        System.out.println("\n1. Home");
        System.out.println("2. Meal Tracker");
        System.out.println("3. Workout");
        System.out.println("4. More");
        System.out.println("5. Exit");
    }
}