package com.pluralsight.bdd.loyalty_card;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;

public class SuperSmoothieStepDefinitions {

    private DrinkCatalog drinkCatalog = new DrinkCatalog();

    private DrinkSchema drinkSchema = new DrinkSchema(drinkCatalog);

    private Member member;

    @Given("the following categorie")
    public void the_following_categorie(List<Map<String,String>> drinkCategory) {
        drinkCategory.stream().forEach(
                drinkLine -> {
                    String drink = drinkLine.get("Drink");
                    String category  = drinkLine.get("Category");
                    Integer points = Integer.parseInt(drinkLine.get("Points"));

                    drinkCatalog.addDrink(drink, category);
                    drinkSchema.setPoint(category,points);


                }

        );
    }

    @Given("^(.*) is a member$")
    public void michael_is_a_member(String name) {
        member = new Member(name, drinkSchema);
    }

    @When("^(.*) purchase (\\d+) (.*) Drinks?")
    public void michael_purchase_banana_Drinks(String name, Integer amount, String drink) {
        member.order(amount,drink);
    }

    @Then("he should gain {int} points")
    public void he_should_gain_points(Integer expectedPoints) {
        assertThat(member.getPoints()).isEqualTo(expectedPoints);
    }



}
