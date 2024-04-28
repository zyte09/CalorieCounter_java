import java.util.ArrayList;
import java.util.List;

public class Workout {
    private final String name;
    private final List<Exercise> exercises;

    public Workout(String name) {
        this.name = name;
        this.exercises = new ArrayList<>();
    }

    public void addExercise(Exercise exercise) {
        exercises.add(exercise);
    }

    public void displayWorkout() {
        System.out.println("\nWorkout Name: " + name);
        for (Exercise exercise : exercises) {
            exercise.displayExercise();
            System.out.println();
        }
    }
}