import java.util.ArrayList;
import java.util.List;

public class Profile {
    private String name, gender, activity, goal;
    private int age, weight, height, goalWeight;
    private List<Integer> weightHistory = new ArrayList<>();

    public Profile(String name, String gender, String activity, String goal, int age, int weight, int height) {
        this.name = name;
        this.gender = gender;
        this.activity = activity;
        this.goal = goal;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public double calcuBMR() {  //Mifflin-St Jeor formula (most accurate)
        double bmr = (10 * weight) + (6.25 * height) - (5 * age);
        if (gender.equalsIgnoreCase("M")){
            bmr += 5; //add 5 for male
        } else if (gender.equalsIgnoreCase("F")) {
            bmr -= 151; //minus 151 for female
        } else {
            System.out.print("Invalid gender provided");
            return 0;
        }
        return bmr;
    }

    public double calcuTDEE() {
        double bmr = calcuBMR();
        double tdee = 0;
        switch(activity) {
            case "Sedentary (Office Job)":
                tdee = bmr * 1.2;
                break;
            case "Light Exercise (1-2 days/week)":
                tdee = bmr * 1.375;
                break;
            case "Moderate Exercise (3-5 days/week)":
                tdee = bmr * 1.55;
                break;
            case "Heavy Exercise (6-7 days/week)":
                tdee = bmr * 1.725;
                break;
            case "Athlete Exercise (2x per day)":
                tdee = bmr * 1.9;
                break;
            default:
                System.out.println("Invalid activity level provided");
        }
        switch(goal) {
            case "Loss weight (Cutting)":
                tdee -= 500;
                break;
            case "Maintain weight (Maintenance)":
                // No change to TDEE
                break;
            case "Gain muscle (Bulking)":
                tdee += 500;
                break;
            default:
                System.out.println("Invalid goal provided");
        }
        return tdee;
    }
    public double calcuTDEEperWeek(){
        return calcuTDEE() * 7;
    }

    public double calcuBMI(){
        double heightMeters = height / 100.0; //convert height cm to meters
        return weight / (heightMeters * heightMeters);
    }

    //display profile
    public void displayProfile(){
        double tdee = (int) calcuTDEE();
        double tdeeperweek = (int) calcuTDEEperWeek();
        double bmr = (int) calcuBMR();
        double bmi = (int) calcuBMI();
        String weightCategory = weightCategory();
        System.out.println("Profile");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Activity Level: " + activity);
        System.out.println("Goal: " + goal);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Weight Category: " + weightCategory);
        System.out.println("Total Daily Energy Expenditure(TDEE): " + tdee + " calories per day.");
        System.out.println("Total Daily Energy Expenditure(TDEE): " + tdeeperweek + " calories per week");
        System.out.println("Basal Metabolic Rate(BMR): " + bmr + " calories per day.");
        System.out.println("Body Mass Index(BMI): " + bmi + "kg/m^2");
    }

    public String weightCategory() {
        double bmi = calcuBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Healthy weight";
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            return "Overweight";
        } else if (bmi >= 30.0 && bmi <= 39.9) {
            return "Obesity";
        } else {
            return "Extreme obesity";
        }
    }

    public int getGoalWeight() {
        return goalWeight;
    }

    public void setGoalWeight(int goalWeight) {
        this.goalWeight = goalWeight;
    }

    public void updateWeight(int newWeight) {
        setWeight(newWeight);
        weightHistory.add(newWeight);
    }

    public int getWeightProgess(){
        if (weightHistory.size() < 2) {
            return 0;
        }
        return weightHistory.get(weightHistory.size() - 1) - weightHistory.get(weightHistory.size() - 2);
    }

    public List<Integer> getWeightHistory(){
        return weightHistory;
    }


    //get and set name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}