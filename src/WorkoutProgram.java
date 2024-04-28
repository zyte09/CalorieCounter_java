import java.util.HashMap;
import java.util.Map;

public class WorkoutProgram {
    private final Map<Integer, Workout> workouts;

    public WorkoutProgram() {
        workouts = new HashMap<>();
        Workout upperBody = new Workout("Upper body workout");
        upperBody.addExercise(new Exercise("5-10 mins cardio", "treadmill/bike etc."));
        upperBody.addExercise(new Exercise("Dynamic Stretching", "Arm circles, Shoulder stretch, etc."));
        upperBody.addExercise(new Exercise("Incline/Flat Bench Press", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        upperBody.addExercise(new Exercise("Pull ups/Lat pulldown", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        upperBody.addExercise(new Exercise("Shoulder Press", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        upperBody.addExercise(new Exercise("Bicep Curls", "3 sets x 6-8 reps (2-3 mins rest between sets)"));
        upperBody.addExercise(new Exercise("Tricep Pushdown", "3 sets x 6-8 reps (2-3 mins rest between sets)"));
        workouts.put(1, upperBody);

        Workout lowerBody = new Workout("Lower body workout");
        lowerBody.addExercise(new Exercise("5-10 mins cardio", "treadmill/bike etc."));
        lowerBody.addExercise(new Exercise("Dynamic Stretching", "Leg swings, Hip circles, etc."));
        lowerBody.addExercise(new Exercise("Squats", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        lowerBody.addExercise(new Exercise("Deadlifts", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        lowerBody.addExercise(new Exercise("Leg Press", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        lowerBody.addExercise(new Exercise("Leg Curls", "3 sets x 10-12 reps (2-3 mins rest between sets)"));
        lowerBody.addExercise(new Exercise("Leg Extensions", "3 sets x 10-12 reps (2-3 mins rest between sets)"));
        workouts.put(2, lowerBody);

        Workout fullBody = new Workout("Full body workout");
        fullBody.addExercise(new Exercise("5-10 mins cardio", "treadmill/bike etc."));
        fullBody.addExercise(new Exercise("Dynamic Stretching", "Arm circles, Leg swings, etc."));
        fullBody.addExercise(new Exercise("Squats", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        fullBody.addExercise(new Exercise("Incline/Flat Bench Press", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        fullBody.addExercise(new Exercise("Pull ups/Lat pulldown", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        fullBody.addExercise(new Exercise("Shoulder Press", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        fullBody.addExercise(new Exercise("Bicep Curls", "3 sets x 6-8 reps (2-3 mins rest between sets)"));
        fullBody.addExercise(new Exercise("Tricep Pushdown", "3 sets x 6-8 reps (2-3 mins rest between sets)"));
        workouts.put(3, fullBody);

        Workout push = new Workout("Push workout");
        push.addExercise(new Exercise("5-10 mins cardio", "treadmill/bike etc."));
        push.addExercise(new Exercise("Dynamic Stretching", "Arm circles, Shoulder stretch, etc."));
        push.addExercise(new Exercise("Incline Bench Press", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        push.addExercise(new Exercise("Flat Bench Press", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        push.addExercise(new Exercise("Chest Flyes", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        push.addExercise(new Exercise("Shoulder Press", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        push.addExercise(new Exercise("Dumbbell Lateral Raises", "3 sets x 10-12 reps (2-3 mins rest between sets)"));
        push.addExercise(new Exercise("Tricep Pushdown", "3 sets x 6-8 reps (2-3 mins rest between sets)"));
        push.addExercise(new Exercise("Tricep Overhead Extension", "3 sets x 6-8 reps (2-3 mins rest between sets)"));
        workouts.put(4, push);

        Workout pull = new Workout("Pull workout");
        pull.addExercise(new Exercise("5-10 mins cardio", "treadmill/bike etc."));
        pull.addExercise(new Exercise("Dynamic Stretching", "Arm circles, Shoulder stretch, etc."));
        pull.addExercise(new Exercise("Pull ups/Lat pulldown", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        pull.addExercise(new Exercise("Bent Over Rows", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        pull.addExercise(new Exercise("Cable Rows", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        pull.addExercise(new Exercise("Lat pullover", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        pull.addExercise(new Exercise("Face Pulls", "3 sets x 10-12 reps (2-3 mins rest between sets)"));
        pull.addExercise(new Exercise("Ez Bar Curls", "3 sets x 6-8 reps (2-3 mins rest between sets)"));
        pull.addExercise(new Exercise("Bicep Curls", "3 sets x 6-8 reps (2-3 mins rest between sets)"));
        pull.addExercise(new Exercise("Hammer Curls", "3 sets x 6-8 reps (2-3 mins rest between sets)"));
        workouts.put(5, pull);

        Workout legs = new Workout("Legs workout");
        legs.addExercise(new Exercise("5-10 mins cardio", "treadmill/bike etc."));
        legs.addExercise(new Exercise("Dynamic Stretching", "Leg swings, Hip circles, etc."));
        legs.addExercise(new Exercise("Squats", "3 sets x 5-8 reps (2-3 mins rest between sets)"));
        legs.addExercise(new Exercise("Romanian Deadlifts", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        legs.addExercise(new Exercise("Leg Press", "3 sets x 5-8 reps (2-3 mins rest between sets)"));
        legs.addExercise(new Exercise("Leg Curls", "3 sets x 10-12 reps (2-3 mins rest between sets)"));
        legs.addExercise(new Exercise("Leg Extensions", "3 sets x 10-12 reps (2-3 mins rest between sets)"));
        legs.addExercise(new Exercise("Calf Raises", "3 sets x 15-20 reps (2-3 mins rest between sets)"));
        workouts.put(6, legs);

        Workout back = new Workout("Back workout");
        back.addExercise(new Exercise("5-10 mins cardio", "treadmill/bike etc."));
        back.addExercise(new Exercise("Dynamic Stretching", "Arm circles, Shoulder stretch, etc."));
        back.addExercise(new Exercise("Deadlifts", "5 sets x 5-8 reps (2-3 mins rest between sets)"));
        back.addExercise(new Exercise("Pull ups/Lat pulldown", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        back.addExercise(new Exercise("Bent Over Rows", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        back.addExercise(new Exercise("Cable Rows", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        back.addExercise(new Exercise("Lat pullover", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        back.addExercise(new Exercise("Face Pulls", "3 sets x 10-12 reps (2-3 mins rest between sets)"));
        workouts.put(7, back);

        Workout chest = new Workout("Chest workout");
        chest.addExercise(new Exercise("5-10 mins cardio", "treadmill/bike etc."));
        chest.addExercise(new Exercise("Dynamic Stretching", "Arm circles, Shoulder stretch, etc."));
        chest.addExercise(new Exercise("Incline Bench Press", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        chest.addExercise(new Exercise("Flat Bench Press", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        chest.addExercise(new Exercise("Chest Flyes", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        chest.addExercise(new Exercise("Chest Dips", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        chest.addExercise(new Exercise("Pushups", "3 sets x 10-12 reps (2-3 mins rest between sets)"));
        workouts.put(8, chest);

        Workout shoulder = new Workout("Shoulder workout");
        shoulder.addExercise(new Exercise("5-10 mins cardio", "treadmill/bike etc."));
        shoulder.addExercise(new Exercise("Dynamic Stretching", "Arm circles, Shoulder stretch, etc."));
        shoulder.addExercise(new Exercise("Military Press", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        shoulder.addExercise(new Exercise("Dumbbell Lateral Raises", "3 sets x 10-12 reps (2-3 mins rest between sets)"));
        shoulder.addExercise(new Exercise("Front Raises", "3 sets x 10-12 reps (2-3 mins rest between sets)"));
        shoulder.addExercise(new Exercise("Arnold Press", "3 sets x 10-12 reps (2-3 mins rest between sets)"));
        shoulder.addExercise(new Exercise("Face Pulls", "3 sets x 10-12 reps (2-3 mins rest between sets)"));
        shoulder.addExercise(new Exercise("Reverse Flyes", "3 sets x 10-12 reps (2-3 mins rest between sets)"));
        workouts.put(9, shoulder);

        Workout arm = new Workout("Arm workout");
        arm.addExercise(new Exercise("5-10 mins cardio", "treadmill/bike etc."));
        arm.addExercise(new Exercise("Dynamic Stretching", "Arm circles, Shoulder stretch, etc."));
        arm.addExercise(new Exercise("Military Press", "3 sets x 8-12 reps (2-3 mins rest between sets)"));
        arm.addExercise(new Exercise("Dumbbell Lateral Raises", "3 sets x 10-12 reps (2-3 mins rest between sets)"));
        arm.addExercise(new Exercise("Cable Lateral Raises", "3 sets x 12-15 reps (2-3 mins rest between sets)"));
        arm.addExercise(new Exercise("Reverse Flyes", "3 sets x 12-15 reps (2-3 mins rest between sets)"));
        arm.addExercise(new Exercise("Ez Bar Skull Crushers", "3 sets x 8-10 reps (super set with close press)"));
        arm.addExercise(new Exercise("Ez Bar Close Press", "3 sets x 8-10 reps (super set with skull crushers)"));
        arm.addExercise(new Exercise("Seated Ez Bar Curls", "3 sets x 8-10 reps (2-3 mins rest between sets)"));
        arm.addExercise(new Exercise("Tricep Pushdown", "3 sets x 8-10 reps (2-3 mins rest between sets)"));
        arm.addExercise(new Exercise("Alternative Dumbbell Curls", "3 sets x 8-10 reps (2-3 mins rest between sets)"));
        arm.addExercise(new Exercise("Alternative Hammer Curls", "3 sets x 8-10 reps (2-3 mins rest between sets)"));
        workouts.put(10, arm);

    }

    public void displayWorkout(int workoutNumber) {
        Workout selectedWorkout = workouts.get(workoutNumber);
        if (selectedWorkout != null) {
            selectedWorkout.displayWorkout();
        } else {
            System.out.println("Invalid choice. Please enter a number between 1 and " + workouts.size());
        }
    }
}