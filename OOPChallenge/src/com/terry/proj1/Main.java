package com.terry.proj1;


public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Parmesan Oregano","Chicken", 5);
        hamburger.setName("Hot Touch Burger");
        System.out.println(hamburger.getName());
        hamburger.addAdditions("olives","sausage","Jalapeno","mushroom",1,2,3,4);
       hamburger.printBill();
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        DeluxeBurger deluxeBurger = new DeluxeBurger("Honey Oats","Bacon", 5,"peri peri fries","coca cola");
        deluxeBurger.setName("Tower Burger");
        System.out.println(deluxeBurger.getName());
        deluxeBurger.addAdditions(null,"","Jalapeno","mushroom",1,2,3,4);
        deluxeBurger.setPriceDeluxe(4);
        deluxeBurger.printBill();
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        HealthyBurger healthyBurger = new HealthyBurger("Chicken", 5);
        healthyBurger.setName("Mc Chicken");
        System.out.println(healthyBurger.getName());
        healthyBurger.addAdditions("","sausage","Jalapeno","mushroom","lettuce", "tomato",1,2,3,4,2,2);
        healthyBurger.printBill();




    }
}
