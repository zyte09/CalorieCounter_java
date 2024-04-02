import java.util.Scanner;
import java.util.LinkedList;

public class program {
    LinkedList<String> workoutProgram = new LinkedList<String>();

    public void displayProgram(){
        System.out.println("Workout Program");
        System.out.println("What would you like to do?");
        System.out.println("1. Add a workout program");
        System.out.println("2. Display workout program");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        input.nextLine();
        switch (choice) {
            case 1:
                addWorkoutProgram();
                break;
            case 2:
                displayWorkoutProgram();
                break;
            case 3:
                System.out.println("Exiting workout program....");
                break;
            default:
                System.out.println("Please enter a valid choice");
        }
        System.out.println("How many days split?");
        System.out.println("1. 1 day split");
        System.out.println("2. 2 day split");
        System.out.println("3. 3 day split");
        System.out.println("4. 4 day split");
        System.out.println("5. 5 day split");
        System.out.println("6. 6 day split");
        System.out.println("7. 7 day split");
        int daysSplit = input.nextInt();
        input.nextLine();

        switch(daysSplit) {
            case 1:
                oneDaySplit();
                break;
            case 2:
                twoDaySplit();
                break;
            case 3:
                threeDaySplit();
                break;
            case 4:
                fourDaySplit();
                break;
            case 5:
                fiveDaySplit();
                break;
            case 6:
                sixDaySplit();
                break;
            case 7:
                sevenDaySplit();
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 7.");
        }
        System.out.println("Workout Program Splits: " + workoutProgram);
    }

    public void oneDaySplit() {
        System.out.println("Choose a workout program (1-day split)");
        System.out.println("1. Full Body Workout");
        System.out.println("2. Upper Body Workout");
        System.out.println("3. Lower Body Workout");
        System.out.println("4. Core Workout");
        System.out.println("5. Push Workout");
        System.out.println("6. Pull Workout");
        System.out.println("7. Legs Workout");
        System.out.println("8. Arms Workout");
        System.out.print("Enter your choice: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        input.nextLine();
        switch(choice) {
            case 1:
                workoutProgram.add("Full Body Workout");
                break;
            case 2:
                workoutProgram.add("Upper Body Workout");
                break;
            case 3:
                workoutProgram.add("Lower Body Workout");
                break;
            case 4:
                workoutProgram.add("Core Workout");
                break;
            case 5:
                workoutProgram.add("Push Workout");
                break;
            case 6:
                workoutProgram.add("Pull Workout");
                break;
            case 7:
                workoutProgram.add("Legs Workout");
                break;
            case 8:
                workoutProgram.add("Arms Workout");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 8.");
        }
    }

    public void twoDaySplit() {
    }

    public void threeDaySplit() {
    }

    public void fourDaySplit() {
    }

    public void fiveDaySplit() {
    }

    public void sixDaySplit() {
    }

    public void sevenDaySplit() {
    }

    public void addWorkoutProgram(){

    }
    public void displayWorkoutProgram(){

    }

}