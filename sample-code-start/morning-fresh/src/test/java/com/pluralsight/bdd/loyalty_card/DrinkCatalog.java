package com.pluralsight.bdd.loyalty_card;

import java.util.HashMap;
import java.util.Map;

public class DrinkCatalog {

    Map<String,String> drinkCategory = new HashMap<>();
    public void addDrink(String drink, String category) {
        drinkCategory.put(drink,category);
    }

    public String getCategory(String drink) {
       return drinkCategory.get(drink);
    }
}
