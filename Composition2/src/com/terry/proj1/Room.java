package com.terry.proj1;

public class Room {
   private String name;
   private int windows;
   private int chairs;



    public Room(String name, int windows, int chairs) {
        this.name = name;
        this.windows = windows;
        this.chairs = chairs;

    }

    public String getName() {
        return name;
    }

    public int getWindows() {
        return windows;
    }

    public int getChairs() {
        return chairs;
    }
}
