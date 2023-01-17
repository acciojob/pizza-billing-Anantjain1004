package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int extraCheesePrice = 80;
    private int extraToppingPrice = 70;
    private int extraNonVegToppingPrice = 120;
    private int paperBag = 20;
    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isOptedForTakeAway = false;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg == true) {
            this.price = 300;
        }
        else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraToppings(){
        if(isVeg == true){
            this.price += extraToppingPrice;
        }
        else{
            this.price += extraNonVegToppingPrice;
        }
        isExtraToppingAdded = true;

    }

    public void addTakeaway(){
        // your code goes here
        isOptedForTakeAway = true;
        this.price += paperBag;
    }

    public String getBill(){
        String bill = "";
        System.out.println("Base Price Of The Pizza: " + basePizzaPrice);
        if(isExtraCheeseAdded) {
            bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
        }
        if(isExtraToppingAdded) {
            if(isVeg == true) {
                bill += "Extra Toppings Added: " + extraToppingPrice + "\n";
            }
            else {
                bill += "Extra Toppings Added: " + extraNonVegToppingPrice + "\n";
            }
        }
        if(isOptedForTakeAway) {
            bill += "Paperbag Added: " + paperBag + "\n";
        }
        bill += "Total Price: " + this.price + "\n";
        return bill;
    }
}
