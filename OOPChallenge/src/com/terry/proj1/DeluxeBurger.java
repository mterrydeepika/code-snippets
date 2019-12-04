package com.terry.proj1;

public class DeluxeBurger extends Hamburger {
    private String chips;
    private String drinks;
    private int priceDeluxe;

    public DeluxeBurger(String breadType, String meat, int price, String chips, String drinks) {
        super(breadType, meat, price);
        this.chips = chips;
        this.drinks = drinks;
    }

    public void setPriceDeluxe(int priceDeluxe) {
        this.priceDeluxe = priceDeluxe;
    }

    @Override
    public void addAdditions(String addition1, String addition2, String addition3, String addition4, int price1, int price2, int price3, int price4) {
        super.addAdditions(addition1, addition2, addition3, addition4, price1, price2, price3, price4);
    }

    @Override
    public void printBill() {
        super.printBill();
        System.out.println("Chips&Drinks  "+ chips +"  "+ drinks + " price: "+ priceDeluxe);
        System.out.println("Final total  : "+ (getTotPrice()+priceDeluxe));


    }
}
