import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Calorie Counter App");
        System.out.println("Please enter your Profile Information:");
        //user input profile info
        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("Enter your gender (M/F): ");
        String gender = input.nextLine();

        System.out.println("Enter your height(cm): ");
        int height = input.nextInt();
        input.nextLine();

        System.out.println("Enter your weight(kg): ");
        int weight = input.nextInt();
        input.nextLine();

        System.out.println("Activity Level");
        System.out.println("1. Sedentary (Office Job)");
        System.out.println("2. Light Exercise (1-2 days/week)");
        System.out.println("3. Moderate Exercise (3-5 days/week)");
        System.out.println("4. Heavy Exercise (6-7 days/week)");
        System.out.println("5. Athlete Exercise (2x per day)");
        int activityChoice = input.nextInt();
        input.nextLine();
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
            default:
                System.out.println("Please enter a valid choice");
        }

        System.out.println("Goal");
        System.out.println("1. Loss weight");
        System.out.println("2. Maintain weight");
        System.out.println("3. Gain muscle");
        int goalChoice = input.nextInt();
        input.nextLine();
        String goal = "";
        switch (goalChoice) {
            case 1:
                goal = "Loss weight";
                break;
            case 2:
                goal = "Maintain weight";
                break;
            case 3:
                goal = "Gain muscle";
                break;
            default:
                System.out.println("Please enter a valid choice");
        }

        Profile user = new Profile(name, gender, activityLevel, goal, age, weight, height);
        //menu
        while (true) {
            displayMenu();
            System.out.println("Please select an option: ");
            int option = input.nextInt();
            input.nextLine();
            switch(option) {
                case 1:
                    MainHub mainHub = new MainHub();
                    mainHub.displaymainHub();
                    break;
                case 2:
                    FoodHub foodHub = new FoodHub();
                    foodHub.displayfoodHub();
                    break;
                case 3:
                    WorkoutHub workoutHub = new WorkoutHub();
                    workoutHub.displayworkoutHub();
                    break;
                case 4:
                    More more = new More();
                    more.displaymore();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    input.close();
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }
        }
    }
    public static void displayMenu() {
        System.out.println("1. Main Hub");
        System.out.println("2. Food Hub");
        System.out.println("3. Workout");
        System.out.println("4. More");
        System.out.println("5. Exit");
    }
}