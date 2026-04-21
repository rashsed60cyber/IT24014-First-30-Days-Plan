public class Car {
    private int speed = 0;
    private int maxSpeed = 120;

    public void accelerate(int amount) {
        if (speed + amount > maxSpeed) {
            System.out.println("Speed limit reached!");
        } else {
            speed += amount;
            System.out.println("Speed: " + speed + " km/h");
        }
    }

    public void brake() {
        speed = 0;
        System.out.println("Car Stopped.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate(60);
        car.accelerate(70);
        car.brake();
    }
}