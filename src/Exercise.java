public class Exercise {
    private final String name;
    private final String sets_reps;

    public Exercise(String name, String sets_reps) {
        this.name = name;
        this.sets_reps = sets_reps;
    }

    public void displayExercise() {
        System.out.println(name);
        System.out.println(sets_reps);
    }
}