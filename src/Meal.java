public class Meal {
    String mealName;
    String foodName;
    double servingSize;
    MealInfo mealInfo; // store the nutritional information of the meal

    public Meal(String mealName, String foodName, double servingSize, MealInfo mealInfo) {
        this.mealName = mealName;
        this.foodName = foodName;
        this.servingSize = servingSize;
        this.mealInfo = mealInfo;
    }

public MealInfo getMealInfo() {
    return mealInfo;
    }
}