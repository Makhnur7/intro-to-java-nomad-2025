import java.util.Scanner;

public class Beec1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double pi = 3.14159;

        double r = (4.0 / 3.0)* pi * Math.pow(a, 3);
        System.out.println("VOLUME = " + r);
    }
}
