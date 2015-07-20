package Drinks;

import java.util.HashMap;

public interface Drink {
    
    String getDrinkName();
    Integer getMenuNumber();
    HashMap<String, Double> getIngredients();
}