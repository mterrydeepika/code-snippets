package com.terry.proj1;

public class Main {

    public static void main(String[] args) {
        Room room1 = new Room("Bedroom", 2,5);
House house= new House(room1,1,1);
        System.out.println(house.getRoom().getWindows());
        System.out.println(house.getNumberWindows());
    }
}
