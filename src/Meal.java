public class Meal {
    private final String mealName;
    private final String foodName;
    private double servingSize;
    private MealInfo mealInfo; // store the nutritional information of the meal

    public Meal(String mealName, String foodName, double servingSize, MealInfo mealInfo) {
        this.mealName = mealName;
        this.foodName = foodName;
        this.servingSize = servingSize;
        this.mealInfo = mealInfo.getScaledMealInfo(servingSize); // scale the nutritional values based on the serving size
    }

    public MealInfo getMealInfo() {
        return mealInfo;
    }

    public void setMealInfo(MealInfo mealInfo) {
        this.mealInfo = mealInfo;
    }

    public double getServingSize() {
        return servingSize;
    }

    public void setServingSize(double servingSize) {
        this.servingSize = servingSize;
        this.mealInfo = this.mealInfo.getScaledMealInfo(servingSize); // update mealInfo when servingSize change
    }

    public String getMealName() {
        return mealName;
    }

    public String getFoodName() {
        return foodName;
    }
}