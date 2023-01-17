package com.driver;

public class DeluxePizza extends Pizza {

     int price;
//    private String bill;

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        addExtraCheese();
        addExtraToppings();
    }

//    @Override
//    public void addExtraCheese() {
//    }
//
//    @Override
//    public void addExtraToppings() {
//    }
}
