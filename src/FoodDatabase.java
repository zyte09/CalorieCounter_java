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
        return mealInfoMap.get(mealName.toLowerCase());
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
    }
}
