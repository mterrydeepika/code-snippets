package com.terry.proj1;
// Create a class and demonstate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.
public class Printer {
    private int tonerLevel=10;
    private double numOfPages;
    private boolean isDuplex;
    //private int numOfpagesprinted;

    public Printer(int tonerLevel, double numOfPages, boolean isDuplex) {
        if(tonerLevel>0 && tonerLevel<=100)
        this.tonerLevel = tonerLevel;
        this.numOfPages = numOfPages;
        this.isDuplex = isDuplex;

    }

    public void fillUpToner(int addtonerLevel)
    {
        if((tonerLevel+addtonerLevel)<=100) {
            tonerLevel += addtonerLevel;
            System.out.println("tonerLevel" + tonerLevel);
        }
        else
        System.out.println("toner level exceeded 100%");
    }

    public void printPage(){
        if(isDuplex)
        System.out.println("numOfpagesprinted"+Math.round(numOfPages/2));
       else
            System.out.println("numOfpagesprinted"+(numOfPages)++);

    }
}
