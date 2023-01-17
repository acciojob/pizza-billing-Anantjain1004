package com.driver;

public class DeluxePizza extends Pizza {

    private int price;
    private String bill;

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {
    }

    @Override
    public void addExtraToppings() {
    }
}
