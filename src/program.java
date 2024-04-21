import java.util.LinkedList;
import java.util.Scanner;
import java.util.HashMap;
public class program {
    HashMap<String, Workout> workoutProgram = new HashMap<>();
    private static final Scanner input = new Scanner(System.in);

    public void displayProgram() {
        System.out.println("Workout Program");
        System.out.println("What would you like to do?");
        System.out.println("1. Add a workout program");
        System.out.println("2. Display workout program");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");
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
    }

        public void addWorkoutProgram(){
        System.out.println("\nHow many days split?");
        System.out.println("1) 1-day split");
        System.out.println("2) 2-day split");
        System.out.println("3) 3-day split");
        System.out.println("4) 4-day split");
        System.out.println("5) 5-day split");
        System.out.println("6) 6-day split");
        System.out.println("7) 7-day split");
        System.out.print("Enter your choice: ");
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

    public void displayWorkoutProgram(){
        if(workoutProgram.isEmpty()){
            System.out.println("No workout program added yet");
        } else {
            System.out.println("Workout Program: " + workoutProgram);
        }
    }

    public void oneDaySplit() {
        System.out.println("Choose a workout program (1-day split)");
        Workout workout = getOneDaySplitWorkoutFromUser();
        workoutProgram.put("1-Day Split", workout);
    }

    public void twoDaySplit() {
        for (int i = 1; i <= 2; i++) {
            System.out.println("Choose a workout program for Day " + i + " (2-day split)");
            String workout = getTwoDaySplitWorkoutFromUser();
            workoutProgram.put("2-Day Split - Day " + i, new Workout(workout));
        }
    }

    public void threeDaySplit() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Choose a workout program for Day " + i + " (3-day split)");
            String workout = getThreeDaySplitWorkoutFromUser();
            workoutProgram.put("3-Day Split - Day " + i, new Workout(workout));
        }
    }

    public void fourDaySplit() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Choose a workout program for Day " + i + " (4-day split)");
            String workout = getFourDaySplitWorkoutFromUser();
            workoutProgram.put("4-Day Split - Day " + i, new Workout(workout));
        }
    }

    public void fiveDaySplit() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Choose a workout program for Day " + i + " (5-day split)");
            String workout = getFiveDaySplitWorkoutFromUser();
            workoutProgram.put("5-Day Split - Day " + i, new Workout(workout));
        }
    }

    public void sixDaySplit() {
        for (int i = 1; i <= 6; i++) {
            System.out.println("Choose a workout program for Day " + i + " (6-day split)");
            String workout = getSixDaySplitWorkoutFromUser();
            workoutProgram.put("6-Day Split - Day " + i, new Workout(workout));
        }
    }

    public void sevenDaySplit() {
        for (int i = 1; i <= 7; i++) {
            System.out.println("Choose a workout program for Day " + i + " (7-day split)");
            String workout = getSevenDaySplitWorkoutFromUser();
            workoutProgram.put("7-Day Split - Day " + i, new Workout(workout));
        }
    }

    public Workout getOneDaySplitWorkoutFromUser() {
        System.out.println("Choose a workout program (1-day split)");
        System.out.println("1. Full Body Workout");
        System.out.println("2. Upper Body Workout");
        System.out.println("3. Lower Body Workout");
        System.out.println("4. Core Workout");
        System.out.print("5. Push Workout");
        System.out.print("6. Pull Workout");
        System.out.print("7. Legs Workout");
        System.out.print("8. Arms Workout");
        System.out.println("Enter your choice: ");
        int choice = input.nextInt();
        input.nextLine();

        Workout workout = new Workout("1-Day Split");
        LinkedList<String> exerciseList = new LinkedList<>();

        switch(choice) {
            case 1:
                System.out.println("Rest time 2-3 minutes between sets");
                exerciseList.add("Squats: 3 sets x 8-12 reps");
                exerciseList.add("Bench Press: 3 sets x 8-12 reps");
                exerciseList.add("Deadlifts: 3 sets x 6-10 reps");
                exerciseList.add("Pull-Ups: 3 sets x maximum reps");
                exerciseList.add("Shoulder Press: 3 sets x 8-12 reps");
                exerciseList.add("Planks: 3 sets x 30-60 seconds");
                workout.addExercise("Full Body Workout", exerciseList);
                break;
            case 2:
                System.out.println("Rest time 2-3 minutes between sets");
                exerciseList.add("Bench Press: 4 sets x 8-12 reps");
                exerciseList.add("Bent Over Rows: 4 sets x 8-12 reps");
                exerciseList.add("Overhead Press: 3 sets x 8-12 reps");
                exerciseList.add("Pull-Ups: 3 sets x maximum reps");
                exerciseList.add("Bicep Curls: 3 sets x 10-12 reps");
                exerciseList.add("Tricep Dips: 3 sets x 10-12 reps");
                workout.addExercise("Upper Body Workout", exerciseList);
                break;
            case 3:
                System.out.println("Rest time 2-3 minutes between sets");
                exerciseList.add("Squats: 4 sets x 8-12 reps");
                exerciseList.add("Deadlifts: 4 sets x 6-10 reps");
                exerciseList.add("Lunges: 3 sets x 10-12 reps per leg");
                exerciseList.add("Leg Press: 3 sets x 8-12 reps");
                exerciseList.add("Calf Raises: 4 sets x 12-15 reps");
                exerciseList.add("Leg Curls: 3 sets x 10-12 reps");
                workout.addExercise("Lower Body Workout", exerciseList);
                break;
            case 4:
                System.out.println("Rest time 2-3 minutes between sets");
                exerciseList.add("Planks: 4 sets x 30-60 seconds");
                exerciseList.add("Russian Twists: 3 sets x 12-15 reps per side");
                exerciseList.add("Bicycle Crunches: 3 sets x 15-20 reps per side");
                exerciseList.add("Leg Raises: 3 sets x 10-12 reps");
                exerciseList.add("Crunches: 3 sets x 15-20 reps");
                exerciseList.add("Mountain Climbers: 3 sets x 20-30 seconds");
                workout.addExercise("Core Workout", exerciseList);
                break;
            case 5:
                System.out.println("Rest time 2-3 minutes between sets");
                exerciseList.add("Bench Press: 4 sets x 8-12 reps");
                exerciseList.add("Shoulder Press: 4 sets x 8-12 reps");
                exerciseList.add("Incline Bench Press: 3 sets x 8-12 reps");
                exerciseList.add("Machine Pec-Flyes: 3 sets x 10-12 reps");
                exerciseList.add("Tricep Pushdowns: 3 sets x 10-12 reps");
                exerciseList.add("Dumbbell Lateral Raises: 3 sets x 12-15 reps");
                workout.addExercise("Push Workout", exerciseList);
                break;
            case 6:
                System.out.println("Rest time 2-3 minutes between sets");
                exerciseList.add("Bent Over Rows: 4 sets x 8-12 reps");
                exerciseList.add("Pull-Ups: 4 sets x maximum reps");
                exerciseList.add("Deadlifts: 3 sets x 6-10 reps");
                exerciseList.add("Lat Pulldowns: 3 sets x 8-12 reps");
                exerciseList.add("Barbell Curls: 3 sets x 10-12 reps");
                exerciseList.add("Seated Cable Rows: 3 sets x 10-12 reps");
                workout.addExercise("Pull Workout", exerciseList);
                break;
            case 7:
                System.out.println("Rest time 2-3 minutes between sets");
                exerciseList.add("Squats: 4 sets x 8-12 reps");
                exerciseList.add("Leg Press: 4 sets x 8-12 reps");
                exerciseList.add("Lunges: 3 sets x 10-12 reps per leg");
                exerciseList.add("Leg Extensions: 3 sets x 10-12 reps");
                exerciseList.add("Hamstring Curls: 3 sets x 10-12 reps");
                exerciseList.add("Calf Raises: 4 sets x 12-15 reps");
                workout.addExercise("Legs Workout", exerciseList);
                break;
            case 8:
                System.out.println("Rest time 2-3 minutes between sets");
                exerciseList.add("Bicep Curls: 4 sets x 10-12 reps");
                exerciseList.add("Tricep Dips: 4 sets x 10-12 reps");
                exerciseList.add("Hammer Curls: 3 sets x 10-12 reps");
                exerciseList.add("Tricep Rope Pushdowns: 3 sets x 10-12 reps");
                exerciseList.add("Preacher Curls: 3 sets x 10-12 reps");
                exerciseList.add("Skull Crushers: 3 sets x 10-12 reps");
                workout.addExercise("Arms Workout", exerciseList);
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 8.");
                break;
        }
        return workout;
    }

    public String getTwoDaySplitWorkoutFromUser() {
        // Provide choices for 2-day split
        // Return the chosen workout
    }

    public String getThreeDaySplitWorkoutFromUser() {
        // Provide choices for 3-day split
        // Return the chosen workout
    }

    public String getFourDaySplitWorkoutFromUser() {
        // Provide choices for 4-day split
        // Return the chosen workout
    }

    public String getFiveDaySplitWorkoutFromUser() {
        // Provide choices for 5-day split
        // Return the chosen workout
    }

    public String getSixDaySplitWorkoutFromUser() {
        // Provide choices for 6-day split
        // Return the chosen workout
    }

    public String getSevenDaySplitWorkoutFromUser() {
        // Provide choices for 7-day split
        // Return the chosen workout
    }
}