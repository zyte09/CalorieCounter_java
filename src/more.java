import java.util.Scanner;

public class more {
    private final Scanner input = new Scanner(System.in);
    public void displayMore(Profile user){
        System.out.println("============ More ============");
        System.out.println("1. Goals");
        System.out.println("2. Nutrition");
        System.out.println("3. View Workout");
        System.out.println("4. Update Profile");
        System.out.println("5. Exit");
        System.out.println("=========================================");

        System.out.println("Please select an option (1-5): ");
        int option = input.nextInt();
        input.nextLine();

        switch(option) {
            case 1:
                goals(user);
                break;
            case 2:
                nutrition();
                break;
            case 3:
                viewWorkout();
                break;
            case 4:
                updateProfile(user);
                break;
            case 5:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Please enter a valid choice");
        }
    }

    public void goals(Profile user) {
        System.out.println("============ Goals ============");
        System.out.println("1. Update Current Weight");
        System.out.println("2. Update Goal Weight");
        System.out.println("3. Update Activity Level");
        System.out.println("4. Back");
        System.out.println("=========================================");

        System.out.println("Please select an option (1-4): ");
        int option = input.nextInt();
        input.nextLine();

        
    }

    public void nutrition(){
        //asas
    }
    public void viewWorkout(){
        //hjhgfd
    }

    public void updateProfile(Profile user){
        //hghghg
    }
}
