public class MealInfo {
    double calories;
    double carbs;
    double fats;
    double protein;
    double servingSize;

    //constructor
    public MealInfo(double calories, double carbs, double fats, double protein) {
        this.calories = calories;
        this.carbs = carbs;
        this.fats = fats;
        this.protein = protein;
    }
    public void scaleNutritionalValues(double newServingSize) {
        double scale = newServingSize / 100.0;
        this.calories *= scale;
        this.carbs *= scale;
        this.fats *= scale;
        this.protein *= scale;
        this.servingSize = 100; // start at 100 gram
    }

    public double getCalories() {
        return calories;
    }
    public double getCarbs() {
        return carbs;
    }
    public double getFats() {
        return fats;
    }
    public double getProtein() {
        return protein;
    }
}