public class MealInfo {
    private final double originalCalories;
    private final double originalCarbs;
    private final double originalFats;
    private final double originalProtein;

    //constructor
    public MealInfo(double calories, double carbs, double fats, double protein) {
        this.originalCalories = calories;
        this.originalCarbs = carbs;
        this.originalFats = fats;
        this.originalProtein = protein;
    }
    public MealInfo scaleNutritionalValues(double newServingSize) {
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