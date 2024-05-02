import java.util.Scanner;
import java.text.DecimalFormat;
public class program {
    private final Scanner input = new Scanner(System.in);
    private final WorkoutProgram workoutProgram = new WorkoutProgram(); //para magamit yung displayWorkout
    private String fitnessLevel = "", trainingGoal = "", trainingFrequency = "", trainingSplit = "", trainingVolume = ""; //para di na need mag input ulit

    public void displayProgram() {
        int choice;
        while (true) {
            System.out.println("\n============ Workout Program ============");
            System.out.println("1. View workout program");
            System.out.println("2. View Training Info");
            System.out.println("3. Estimate your 1RM");
            System.out.println("4. Exit");
            System.out.println("=========================================");
            System.out.print("Enter your choice: ");
            if (input.hasNextInt()) {
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        workoutProgram();
                        break;
                    case 2:
                        viewTrainingInfo();
                        break;
                    case 3:
                        estimate1RM();
                        break;
                    case 4:
                        System.out.println("Exiting Workout Program...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.next();
            }
        }
    }

    public void workoutProgram(){
        int workoutChoice;
        while (true) {
            System.out.println("\n============ Workout Program ============");
            System.out.println("1. Upper body workout");
            System.out.println("2. Lower body workout");
            System.out.println("3. Full body workout");
            System.out.println("4. Push workout");
            System.out.println("5. Pull workout");
            System.out.println("6. Legs workout");
            System.out.println("7. Back workout");
            System.out.println("8. Chest workout");
            System.out.println("9. Shoulder workout");
            System.out.println("10. Arm workout");
            System.out.println("11. Exit");
            System.out.println("=========================================");
            System.out.print("Enter your choice (1-11): ");
            if (input.hasNextInt()) {
                workoutChoice = input.nextInt();
                if (workoutChoice >= 1 && workoutChoice <= 10) {
                    workoutProgram.displayWorkout(workoutChoice);
                    break;
                } else if (workoutChoice == 11) {
                    System.out.println("Exiting Workout Program...");
                    return;
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 11.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.next();
            }
        }
    }

    public void viewTrainingInfo() {
        if (fitnessLevel.isEmpty()) {
            System.out.println("\n================ Training Info ================");
            System.out.println("What's your fitness level?");
            System.out.println("1. Beginner (Less than 6 months of experience)");
            System.out.println("2. Intermediate (6 months - 1 year of experience)");
            System.out.println("3. Advanced (More than 1 year of experience)");
            System.out.println("=================================================");
            System.out.print("Enter your choice (1-3): ");
            int fitnessLevelchoice = 0;
            while (fitnessLevelchoice < 1 || fitnessLevelchoice > 3) {
                if (input.hasNextInt()) {
                    fitnessLevelchoice = input.nextInt();
                    if (fitnessLevelchoice < 1 || fitnessLevelchoice > 3) {
                        System.out.print("Invalid choice. Please enter a number between (1-3).");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    input.next();// discard the invalid input
                }
            }
            switch (fitnessLevelchoice) {
                case 1:
                    fitnessLevel = "Beginner (Less than 6 months of experience)";
                    break;
                case 2:
                    fitnessLevel = "Intermediate (6 months - 1 year of experience)";
                    break;
                case 3:
                    fitnessLevel = "Advanced (More than 1 year of experience)";
                    break;
            }
        }

        if (trainingGoal.isEmpty()) {
            System.out.println("\n================ Training Info ================");
            System.out.println("What's your training goal?");
            System.out.println("1. Strength");
            System.out.println("2. Hypertrophy (Muscle Growth)");
            System.out.println("3. Endurance");
            System.out.println("=================================================");
            System.out.print("Enter your choice (1-3): ");
            int trainingGoalchoice = 0;
            while (trainingGoalchoice < 1 || trainingGoalchoice > 3) {
                if (input.hasNextInt()) {
                    trainingGoalchoice = input.nextInt();
                    if (trainingGoalchoice < 1 || trainingGoalchoice > 3) {
                        System.out.print("Invalid choice. Please enter a number between (1-3).");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    input.next();
                }
            }
            switch(trainingGoalchoice) {
                case 1:
                    trainingGoal = "Strength";
                    break;
                case 2:
                    trainingGoal = "Hypertrophy (Muscle Growth)";
                    break;
                case 3:
                    trainingGoal = "Endurance";
                    break;
            }
        }

        if (trainingFrequency.isEmpty()) {
            System.out.println("\n================ Training Info ================");
            System.out.println("What's your training frequency?");
            System.out.println("1. 3 days per week");
            System.out.println("2. 4 days per week");
            System.out.println("3. 5 days per week");
            System.out.println("4. 6 days per week");
            System.out.println("5. 7 days per week");
            System.out.println("=================================================");
            System.out.print("Enter your choice (1-5): ");
            int trainingFrequencychoice = 0;
            while (trainingFrequencychoice < 1 || trainingFrequencychoice > 5) {
                if (input.hasNextInt()) {
                    trainingFrequencychoice = input.nextInt();
                    if (trainingFrequencychoice < 1 || trainingFrequencychoice > 5) {
                        System.out.print("Invalid choice. Please enter a number between (1-5).");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    input.next();
                }
            }
            switch(trainingFrequencychoice) {
                case 1:
                    trainingFrequency = "3 days per week";
                    break;
                case 2:
                    trainingFrequency = "4 days per week";
                    break;
                case 3:
                    trainingFrequency = "5 days per week";
                    break;
                case 4:
                    trainingFrequency = "6 days per week";
                    break;
                case 5:
                    trainingFrequency = "7 days per week";
                    break;
            }
        }

        if (trainingSplit.isEmpty()){
            System.out.println("============ Training Info ============");
            System.out.println("What's your training split?");
            System.out.println("1. Full body workout");
            System.out.println("2. Upper/Lower body split");
            System.out.println("3. Push/Pull/Legs split");
            System.out.println("=========================================");
            System.out.print("Enter your choice (1-3): ");
            int trainingSplitchoice = 0;
            while (trainingSplitchoice < 1 || trainingSplitchoice > 3) {
                if (input.hasNextInt()) {
                    trainingSplitchoice = input.nextInt();
                    if (trainingSplitchoice < 1 || trainingSplitchoice > 3) {
                        System.out.print("Invalid choice. Please enter a number between (1-3).");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    input.next();
                }
            }
            switch(trainingSplitchoice) {
                case 1:
                    trainingSplit = "Full body workout";
                    break;
                case 2:
                    trainingSplit = "Upper/Lower body split";
                    break;
                case 3:
                    trainingSplit = "Push/Pull/Legs split";
                    break;
            }
        }

        if (trainingVolume.isEmpty()){
            System.out.println("\n================= Training Info ================");
            System.out.println("What's your training volume?");
            System.out.println("1. Low volume (3-6 sets per muscle group)");
            System.out.println("2. Moderate volume (7-9 sets per muscle group)");
            System.out.println("3. High volume (10+ sets per muscle group)");
            System.out.println("==================================================");
            System.out.print("Enter your choice (1-3): ");
            int trainingVolumechoice = 0;
            while (trainingVolumechoice < 1 || trainingVolumechoice > 3) {
                if (input.hasNextInt()) {
                    trainingVolumechoice = input.nextInt();
                    if (trainingVolumechoice < 1 || trainingVolumechoice > 3) {
                        System.out.print("Invalid choice. Please enter a number between (1-3).");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    input.next();
                }
            }
            switch(trainingVolumechoice) {
                case 1:
                    trainingVolume = "Low volume (3-6 sets per muscle group)";
                    break;
                case 2:
                    trainingVolume = "Moderate volume (7-9 sets per muscle group)";
                    break;
                case 3:
                    trainingVolume = "High volume (10+ sets per muscle group)";
                    break;
            }
        }

        System.out.println("\nTraining Info:");
        System.out.println("Fitness Level: " + fitnessLevel);
        System.out.println("Training Goal: " + trainingGoal);
        System.out.println("Training Frequency: " + trainingFrequency);
        System.out.println("Training Split: " + trainingSplit);
        System.out.println("Training Volume: " + trainingVolume);
    }

    //getter and setter for viewTrainingInfo
    public String getFitnessLevel() {
        return fitnessLevel;
    }
    public String getTrainingGoal() {
        return trainingGoal;
    }
    public String getTrainingFrequency() {
        return trainingFrequency;
    }
    public String getTrainingSplit() {
        return trainingSplit;
    }
    public String getTrainingVolume() {
        return trainingVolume;
    }
    public void setFitnessLevel(String fitnessLevel) {
        this.fitnessLevel = fitnessLevel;
    }
    public void setTrainingGoal(String trainingGoal) {
        this.trainingGoal = trainingGoal;
    }
    public void setTrainingFrequency(String trainingFrequency) {
        this.trainingFrequency = trainingFrequency;
    }
    public void setTrainingSplit(String trainingSplit) {
        this.trainingSplit = trainingSplit;
    }
    public void setTrainingVolume(String trainingVolume) {
        this.trainingVolume = trainingVolume;
    }

    public void estimate1RM() {
        System.out.println("\n============= 1RM Estimator =============");
        System.out.println("Estimate your 1 rep max");
        System.out.print("Enter the weight lifted (kg): ");
        while (!input.hasNextInt()){
            System.out.println("Invalid input. Please enter a number.");
            input.next();
        }
        int weightLifted = input.nextInt();
        System.out.print("Enter the number of repetitions: ");
        while (!input.hasNextInt()){
            System.out.println("Invalid input. Please enter a number.");
            input.next();
        }
        int reps = input.nextInt();
        while (reps > 30) {
            System.out.println("Please enter a valid number of repetitions (less than 30): ");
            reps = input.nextInt();
        }
        input.nextLine();
        DecimalFormat df = new DecimalFormat("#.##");
        double oneRepMax = calculateOneRepMax(weightLifted, reps);
        System.out.println("Your estimated 1RM is: " + df.format(oneRepMax) + " kg");
        System.out.println("=========================================");
    }

    public double calculateOneRepMax(int weight, int reps) {
        return weight * (1 + (double) reps / 30);
    }

}