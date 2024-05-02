import java.util.HashMap;
public class FoodDatabase {
    HashMap<String, MealInfo> mealInfoMap = new HashMap<>();

    public FoodDatabase() {
        addDefaultMeals();
    }

    public void addMealInfo(String mealName, MealInfo mealInfo) {
        mealInfoMap.put(mealName.toLowerCase(), mealInfo);
    }

    public MealInfo getMealInfo(String mealName) {
        MealInfo originalMealInfo = mealInfoMap.get(mealName.toLowerCase());
        return new MealInfo(originalMealInfo.getCalories(), originalMealInfo.getCarbs(), originalMealInfo.getFats(), originalMealInfo.getProtein());
    }

    public boolean hasMealInfo(String mealName) {
        return mealInfoMap.containsKey(mealName.toLowerCase());
    }

    //default values in 100 grams
    public void addDefaultMeals() {
        MealInfo whiteRice = new MealInfo(130, 28.17, 0.28, 2.69);
        addMealInfo("White Rice", whiteRice);
        MealInfo brownRice = new MealInfo(123, 25.58, 0.97, 2.74);
        addMealInfo("Brown Rice", brownRice);
        MealInfo rawChickenBreast = new MealInfo(120, 0, 2.62, 22.5);
        addMealInfo("Chicken Breast Raw", rawChickenBreast);
        MealInfo rawChickenThigh = new MealInfo(222, 0.25, 16.61, 16.62);
        addMealInfo("Chicken Thigh Raw", rawChickenThigh);
    }
}
