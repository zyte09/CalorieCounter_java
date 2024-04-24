import java.util.Map;
import java.util.Scanner;
public class program {
    private final Scanner input = new Scanner(System.in);
    private final Map<String, Workout> workouts;

    public program(){
        this.workouts = Workout.initializeWorkouts();
    }

    public void displayProgram() {
        while (true) {
            System.out.println("Workout Program");
            System.out.println("\n1. Start your workout");
            System.out.println("2. Training program");
            System.out.println("3. Estimate your 1RM");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    startWorkout();
                    break;
                case 2:
                    training();
                    break;
                case 3:
                    estimate1RM();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
    }

    public void training() {
        System.out.println("What's your fitness level?");
        System.out.println("1. Beginner (Less than 6 months of experience)");
        System.out.println("2. Intermediate (More than 6 months and less than 2 years of experience)");
        System.out.println("3. Advanced (More than 2 years of experience)");
        System.out.println("Enter your choice: ");
        int fitnessLevel = input.nextInt();
        input.nextLine();

    }

    public void estimate1RM() {
        System.out.println("Estimate your 1RM");
        System.out.println("Enter the weight lifted (kg): ");
        int weightLifted = input.nextInt();
        System.out.println("Enter the number of repetitions: ");
        int reps = input.nextInt();
        while (reps > 30) {
            System.out.println("Please enter a valid number of repetitions (less than 30): ");
            reps = input.nextInt();
        }
        input.nextLine();

        double oneRepMax = calculateOneRepMax(weightLifted, reps);
        System.out.println("Your estimated 1RM is: " + oneRepMax + " kg");
    }

    public double calculateOneRepMax(int weight, int reps) {
        return weight * (1 + (double) reps / 30);
    }

    public void bodyweightWorkout() {
        while (true) {
            System.out.println("Do you want to start your workout?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.println("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();
            if (choice == 1) {
                System.out.println("Choose a workout:");
                for (String workoutName : workouts.keySet()) {
                    System.out.println(workoutName);
                }
                System.out.print("\nEnter your choice: ");
                String chosenWorkout = input.nextLine();
                displayWorkout(chosenWorkout);
                workouts.get(chosenWorkout).startWorkout();
                return;

            } else if (choice == 2) {
                return;
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
    }

    public void gymWorkout() {
        System.out.println("Choose a workout:");
        for (String workoutName : workouts.keySet()) {
                System.out.println(workoutName);
        }
        String chosenWorkout = input.nextLine();
        displayWorkout(chosenWorkout);
        workouts.get(chosenWorkout).startWorkout();
    }

    private void displayWorkout(String workoutName) {
        Workout workout = workouts.get(workoutName);
        if (workout != null) {
            System.out.println("\nExercises for " + workout.getName() + ":");
            for (Exercise exercise : workout.getExercises()) {
                System.out.println(exercise);
            }
        } else {
            System.out.println("No exercises found for this workout.");
        }
    }
    public void startWorkout() {
        System.out.println("Choose a workout:");
        for (String workoutName : workouts.keySet()) {
            System.out.println(workoutName);
        }
        String chosenWorkout = input.nextLine();
        displayWorkout(chosenWorkout);
        workouts.get(chosenWorkout).startWorkout();
    }
}