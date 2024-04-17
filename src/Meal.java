public class Meal {
    private final String mealName;
    private final String foodName;
    double servingSize;
    MealInfo mealInfo; // store the nutritional information of the meal

    public Meal(String mealName, String foodName, double servingSize, MealInfo mealInfo) {
        this.mealName = mealName;
        this.foodName = foodName;
        this.servingSize = servingSize;
        this.mealInfo = mealInfo.scaleNutritionalValues(servingSize); // scale the nutritional values based on the serving size
    }

    public MealInfo getMealInfo() {
        return mealInfo;
    }

    public void setMealInfo(MealInfo mealInfo) {
        this.mealInfo = new MealInfo(mealInfo.getCalories(), mealInfo.getCarbs(), mealInfo.getFats(), mealInfo.getProtein()); // create a new MealInfo object
    }

    public double getServingSize() {
        return servingSize;
    }

    public String getMealName() {
        return mealName;
    }

    public String getFoodName() {
        return foodName;
    }
}