package com.terry.proj1;

public class HealthyBurger extends Hamburger {
    private String addition5;
    private String addition6;
    private int price5;
    private int price6;
    public HealthyBurger(String meat, int price) {
        super("Brown rye", meat, price);
    }




    public void addAdditions(String addition1, String addition2, String addition3, String addition4,String addition5,String addition6, int price1, int price2, int price3, int price4, int price5, int price6) {
        addAdditions(addition1, addition2, addition3, addition4, price1, price2, price3, price4);

        if (!addition5.isEmpty()) {
           // System.out.println("The fifth addition is " + addition5 + " and price is: " + price5);
            this.addition5=addition5;
            this.price5=price5;
        }
        else

            this.addition5="";

        if (!addition6.isEmpty()) {
           // System.out.println("The second addition is " + addition6 + " and price is: " + price6);
            this.addition6=addition6;
            this.price6=price6;


        }
        else
            this.addition6="";
    }

    @Override
    public void printBill() {
        super.printBill();
        System.out.println("Additional5  "+addition5 + " price: "+ price5);
        System.out.println("Additional6  "+addition6 + " price: "+ price6);
        System.out.println("Final Total  : "+ (getTotPrice()+price5+price6));
    }
}
