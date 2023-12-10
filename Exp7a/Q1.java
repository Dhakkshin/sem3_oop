package Exp7a;

class Vehicle {
    String make;
    String model;

    void startEngine() {
        System.out.println("Engine started.");
    }

    void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

class Car extends Vehicle {
    int numDoors;

    void drive() {
        System.out.println("Car is in motion.");
    }
}
