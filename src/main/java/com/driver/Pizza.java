package com.driver;

public class Pizza {
    public int cheesePrice;
    public int basePrice;
    public int toppingsPrice;
    public int paperBagPrice;
    public String bill;
    public int totalPrice;
    public boolean isCheeseAdded;
    public boolean isToppingsAdded;
    public boolean isPaperBagAdded;
    public boolean isBillGenerator;

    public Pizza(Boolean isVeg) {
        if(isVeg) {
            basePrice = 300;
            toppingsPrice = 70;
        }
        else {
            basePrice = 400;
            toppingsPrice = 120;
        }
        cheesePrice = 80;
        paperBagPrice = 20;
        isCheeseAdded = false;
        isToppingsAdded = false;
        isPaperBagAdded = false;
        isBillGenerator = false;
        totalPrice = basePrice;
        bill = "Base Price Of The Pizza: " + basePrice + "\n";
    }
    public int getPrice() {
        return totalPrice;
    }

    public void addExtraCheese(){
        if(isCheeseAdded == false) {
            this.totalPrice += cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(isToppingsAdded == false) {
            this.totalPrice += toppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(isPaperBagAdded == false) {
            this.totalPrice += paperBagPrice;
            isPaperBagAdded = true;
        }
    }

    public String getBill(){
        if(isBillGenerator == false) {
            if(isCheeseAdded == true) {
                bill += "Extra Cheese Added: " + cheesePrice + "\n";
            }
            if(isToppingsAdded == true) {
                bill += "Extra Toppings Added: " + toppingsPrice + "\n";
            }
            if(isPaperBagAdded == true) {
                bill += "Paperbag Added: " + paperBagPrice + "\n";
            }
            bill += "Total Price: " + totalPrice + "\n";
            isBillGenerator = true;
        }
        return bill;
    }
}
