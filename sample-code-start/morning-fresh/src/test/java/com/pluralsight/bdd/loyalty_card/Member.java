package com.pluralsight.bdd.loyalty_card;

public class Member {

    String name;
    Integer command;

    DrinkSchema  schema;

    public Member(String name, DrinkSchema schema){
        command=0;
        this.schema=schema;
        this.name=name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void order(Integer amount, String drink) {
        command+=amount*getPointsDrink(drink);
    }

    private Integer getPointsDrink(String drink) {
        return schema.getPointFor(drink);
    }

    public Integer getPoints() {
        return command;
    }
}
