public class Phone {
    private String password = "1234";
    private boolean locked = true;

    public void unlock(String input) {
        if (input.equals(password)) {
            locked = false;
            System.out.println("Phone Unlocked!");
        } else {
            System.out.println("Wrong Password!");
        }
    }

    public boolean isLocked() {
        return locked;
    }
}

public class Main {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.unlock("0000");
        p.unlock("1234");
    }
}