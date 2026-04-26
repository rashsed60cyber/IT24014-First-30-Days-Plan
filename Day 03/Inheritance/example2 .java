class Phone {
    String brand;

    Phone(String brand) {
        this.brand = brand;
    }

    void call() {
        System.out.println(brand + " is calling..");
    }

    void text() {
        System.out.println(brand + " is sending a message...");
    }
}

class Smartphone extends Phone {

    Smartphone(String brand) {
        super(brand);
    }

    void openYoutube() {
        System.out.println("YouTube is opening...");
    }

    void takeSelfie() {
        System.out.println("Taking a selfie... ");
    }
}

public class Main {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone("Samsung");
        myPhone.call();
        myPhone.text();
        myPhone.openYoutube();
        myPhone.takeSelfie();
    }
}