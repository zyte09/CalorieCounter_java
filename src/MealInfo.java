public class MealInfo {
    private final double originalCalories;
    private final double originalCarbs;
    private final double originalFats;
    private final double originalProtein;

    //constructor mealinfo with nutritional info
    public MealInfo(double calories, double carbs, double fats, double protein) {
        if (calories < 0 || carbs < 0 || fats < 0 || protein < 0 ) {
            System.out.println("Nutritional values cannot be negative.");
        }
        this.originalCalories = Math.abs(calories);
        this.originalCarbs = Math.abs(carbs);
        this.originalFats = Math.abs(fats);
        this.originalProtein = Math.abs(protein);
    }
    //return mealinfo with nutritional values scaled by 100grams
    public MealInfo getScaledMealInfo(double newServingSize) {
        double scale = newServingSize / 100.0;
        return new MealInfo(
                originalCalories * scale,
                originalCarbs * scale,
                originalFats * scale,
                originalProtein * scale
        );
    }

    public double getCalories() {
        return originalCalories;
    }
    public double getCarbs() {
        return originalCarbs;
    }
    public double getFats() {
        return originalFats;
    }
    public double getProtein() {
        return originalProtein;
    }
}