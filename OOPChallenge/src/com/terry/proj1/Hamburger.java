package com.terry.proj1;

import java.util.Scanner;

public class Hamburger {
    private String breadType;
    private String meat;
    private int price;
    private int totPrice;
    private String name;
    private String addition1;
    private String addition2;
    private String addition3;
    private String addition4;
    private int price1;
    private int price2;
    private int price3;
    private int price4;




    public Hamburger(String breadType, String meat, int price) {
        this.breadType = breadType;
        this.meat = meat;
        this.price = price;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAdditions(String addition1, String addition2, String addition3, String addition4, int price1, int price2, int price3, int price4) {
        if (null!=addition1 && !addition1.isEmpty()) {
          //  System.out.println("The first addition is " + addition1 + " and price is: " + price1);
            this.addition1=addition1;
            this.price1=price1;
        }
        else
            this.addition1="Not added";

        if (null!=addition2 && !addition2.isEmpty()) {
           // System.out.println("The second addition is " + addition2 + " and price is: " + price2);
            this.addition2=addition2;
            this.price2=price2;

        }
        else
            this.addition2="Not added";

        if (null!=addition3 && !addition3.isEmpty()) {
           // System.out.println("The third addition is " + addition3 + " and price is: " + price3);
            this.addition3=addition3;
            this.price3=price3;

        }
        else
            this.addition3="";

        if (!addition4.isEmpty()) {
            //System.out.println("The fourth addition is " + addition4 + " and price is: " + price4);
            this.addition4=addition4;
            this.price4=price4;

        }
        else
            this.addition4="";

    }

    public int getTotPrice() {
        return totPrice;
    }

    public void printBill() {
        totPrice=(price+price1+price2+price3+price4);
        System.out.println("Base price: "+price);
        System.out.println("Additional1  "+addition1 + " price: "+ price1);
        System.out.println("Additional2  "+addition2 + " price: "+ price2);
        System.out.println("Additional3  "+addition3 + " price: "+ price3);
        System.out.println("Additional4  "+addition4 + " price: "+ price4);
        System.out.println("Total price : "+ totPrice);


    }
}
