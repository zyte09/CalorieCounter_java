public class MealInfo {
    double calories;
    double carbs;
    double fats;
    double protein;

    //constructor
    public MealInfo(double calories, double carbs, double fats, double protein) {
        this.calories = calories;
        this.carbs = carbs;
        this.fats = fats;
        this.protein = protein;
    }
    public void scaleNutritionalValues(double servingSize) {
        double scale = servingSize / 100.0;
        this.calories *= scale;
        this.carbs *= scale;
        this.fats *= scale;
        this.protein *= scale;
    }
}