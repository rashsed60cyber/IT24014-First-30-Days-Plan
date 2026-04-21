class Car {
    String brand;
    String color;
    int speed;

  
    Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    void showInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("-------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Red", 180);
        Car car2 = new Car("BMW", "Black", 250);
        Car car3 = new Car("Honda", "White", 160);

        car1.showInfo();
        car2.showInfo();
        car3.showInfo();
    }
}