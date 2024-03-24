public class Profile {
    private String name, gender, activity, goal;
    private int age, weight, height;

    public Profile(String name, String gender, String activity, String goal, int age, int weight, int height) {
        this.name = name;
        this.gender = gender;
        this.activity = activity;
        this.goal = goal;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    //display profile
    public void displayProfile(){
        System.out.println("Profile");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Activity Level: " + activity);
        System.out.println("Goal: " + goal);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " cm");
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