import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        int s = 0;
        int temp = x;
        
        while (temp > 0) {
            s = s + (temp % 10);
            temp = temp / 10;
        }
        
        if (x % s == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not Harshad Number");
        }
    }
}
