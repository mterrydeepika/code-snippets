package com.terry.proj1;
// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generice car calss.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).
class Car
{
    public String name;
    public int noCylinders;
    public int noWheels;
    public boolean isEngine;

    public Car(String name, int noCylinders) {
        this.name = name;
        this.noCylinders = noCylinders;
        this.noWheels = 4;
        this.isEngine = true;
    }

    public String getName() {
        return name;
    }

    public int getNoCylinders() {
        return noCylinders;
    }

    public int getNoWheels() {
        return noWheels;
    }

    public boolean isEngine() {
        return isEngine;
    }

    public void startEngine()
{
    System.out.println("Car's Engine started, is running");
}

    public void accelerate(int speed)
{
    System.out.println("Car Accelerated with speed "+speed+ "km/hr");
}

    public void brake(String brakeType)
    {
        System.out.println("Car's Brake pressed with "+brakeType+ " and vehicle stopped");
    }
}

class Zen extends Car{
    public Zen(String name, int noCylinders) {
        super(name, noCylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Zen's Engine started, is running");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Zen Accelerated with speed "+speed+ "km/hr");
    }

    @Override
    public void brake(String brakeType) {
        System.out.println("Zen's Brake pressed with "+brakeType+ " and vehicle stopped");
    }
}

class Lancer extends Car{

    public Lancer(String name, int noCylinders) {
        super(name, noCylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Lancer's Engine started, is running");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Lancer Accelerated with speed "+speed+ "km/hr");
    }

    @Override
    public void brake(String brakeType) {
        System.out.println("Lancer's Brake pressed with "+brakeType+ " and vehicle stopped");
    }
}
public class Main {

    public static void main(String[] args) {
Car car = new Car("Some Car", 2);
    Car car1 = new Zen("Zen",4);
        Car car2 = new Lancer("Lancer",6);
        Zen zen  = new Zen("Zen", 5);
        car.startEngine();
        car1.startEngine();
        car2.startEngine();
        zen.startEngine();




    }
}
