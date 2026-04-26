class Vehicle {
    String brand;
    String color;

    Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    void start() {
        System.out.println(brand + " engine started!");
    }

    void stop() {
        System.out.println(brand + " engine stopped!");
    }
}

class Car extends Vehicle {

    Car(String brand, String color) {
        super(brand, color);
    }

    void horn() {
        System.out.println("Beep Beep!");
    }
}

class Bike extends Vehicle {

    Bike(String brand, String color) {
        super(brand, color);
    }

    void wheelie() {
        System.out.println("Doing a wheelie!");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Red");
        myCar.start();