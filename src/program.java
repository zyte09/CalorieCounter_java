import java.util.Scanner;
import java.util.LinkedList;
public class program {
    public void displayProgram(){
        System.out.println("Workout Program");
    }

    public void setupWorkoutProgram(){
        Scanner input = new Scanner(System.in);
        int weeks = input.nextInt();
        input.nextLine();


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

        LinkedList<String> workoutProgram = new LinkedList<String>();

    }
}
