package com.terry.proj1;
// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.
public class House {
    private Room room;
private int garden;
private int backyard;

    public House(Room room, int garden, int backyard) {
        this.room = room;
        this.garden = garden;
        this.backyard = backyard;
    }

    public int getNumberWindows()
    {
        return room.getWindows();
    }

    public Room getRoom() {
        return room;
    }

    public int getGarden() {
        return garden;
    }

    public int getBackyard() {
        return backyard;
    }



}
