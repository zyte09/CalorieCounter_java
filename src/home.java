public class home {
    private final mealTracker mealTracker;

    public home(mealTracker mealTracker) {
        this.mealTracker = mealTracker;
    }
    public void displayHome(Profile user) {
        System.out.println("============ Home ============");
        System.out.println("Calories");
        double totalCalories = mealTracker.getTotalCalForMeals("Breakfast")
                + mealTracker.getTotalCalForMeals("Lunch")
                + mealTracker.getTotalCalForMeals("Dinner")
                + mealTracker.getTotalCalForMeals("Snacks");
        double remainingCalories = user.calcuTDEE() - totalCalories;
        System.out.println("Goal = " + user.calcuTDEE() + " for today");
        System.out.println("Food = " + totalCalories);
        System.out.println("Remaining = Goal - Food");
        System.out.println("Remaining = " + remainingCalories);
        displayMealInfo();
        displayWeightProgress(user);
    }
    public void displayMealInfo() {
    System.out.println("\n============ Meal Information ============");
    System.out.println("Breakfast: " + mealTracker.getTotalCalForMeals("Breakfast") + " calories");
    System.out.println("Lunch: " + mealTracker.getTotalCalForMeals("Lunch") + " calories");
    System.out.println("Dinner: " + mealTracker.getTotalCalForMeals("Dinner") + " calories");
    System.out.println("Snacks: " + mealTracker.getTotalCalForMeals("Snacks") + " calories");
    System.out.println("=========================================");
    }

    public void displayWeightProgress(Profile user) {
        System.out.println("\n============ Weight Progress ============");
        System.out.println("Current Weight: " + user.getWeight() + " kg");
        int weightProgress = user.getWeightProgess();
        if (weightProgress > 0) {
            System.out.println("You have gained " + weightProgress + " kg since your last update.");
        } else if (weightProgress < 0) {
            System.out.println("You have lost " + Math.abs(weightProgress) + " kg since your last update.");
        } else {
            System.out.println("Your weight has not changed since your last update.");
        }
        System.out.println("=========================================");
    }
}
