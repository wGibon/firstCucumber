package com.pluralsight.bdd.loyalty_card;

import java.util.HashMap;
import java.util.Map;

public class DrinkSchema {

    Map<String, Integer> drinkSchema;
    DrinkCatalog  drinkCatalog;

    public DrinkSchema(DrinkCatalog  drinkCatalog ){
        drinkSchema= new HashMap<>();
        this.drinkCatalog = drinkCatalog;
    }
    public void setPoint(String category, Integer points) {
        drinkSchema.put(category, points);
    }

    public Integer getPoint(String category) {
       return drinkSchema.get(category);
    }

    public Integer getPointFor(String drink) {
        return drinkSchema.get(categoryOf(drink));
    }

    public String categoryOf(String drink) {
        return drinkCatalog.getCategory(drink);
    }

}
