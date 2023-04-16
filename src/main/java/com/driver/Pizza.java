package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private boolean isCheeseAdded;
    private boolean isExtraToppings;
    private boolean isTakeAway;
    private String bill;
    private int basePrice;
    private int toppingPrice;
    private int vegPizzaBasePrice = 300;
    private int nonVegPizzaBasePrice = 400;
    private int cheesePrice = 80;
    private int extraToppings = 70;
    private int vegToppings = 70;
    private int nonVegToppings = 120;
    private int takeAway = 20;
    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        basePrice = getBasePrice();
        price = basePrice;
        this.isCheeseAdded = false;
        this.isExtraToppings = false;
        this.isTakeAway = false;
    }

    public int getPrice(){
        return this.price;
    }
    private int getBasePrice() {
        return isVeg ? vegPizzaBasePrice : nonVegPizzaBasePrice;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded) {
            isCheeseAdded = true;
            price += cheesePrice;
        }
    }

    public void addExtraToppings(){
        if(!isExtraToppings) {
            isExtraToppings = true;
            if(isVeg) {
                toppingPrice = vegToppings;
                price += vegToppings;
            }
            else {
                toppingPrice = nonVegToppings;
                price += nonVegToppings;
            }
        }
    }

    public void addTakeaway(){
        if(!isTakeAway) {
            isTakeAway = true;
            price += takeAway;
        }
    }

    public String getBill(){
        String str = "";
        str += "The base of pizza : " + basePrice + "\n";
        if(isCheeseAdded) {
            str += "Extra cheese added : " + cheesePrice + "\n";
        }
        if(isExtraToppings) {
            str += "Extra toppings added : " + toppingPrice + "\n";
        }
        if(isTakeAway) {
            str += "Extra paper bag price : " + takeAway + "\n";
        }
        str += "Total price : " + price + "\n";
        this.bill = str;
        return this.bill;
    }
}
