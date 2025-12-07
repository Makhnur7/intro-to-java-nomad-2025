import java.util.Scanner;

public class Beec1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = sc.nextDouble();

        int product = sc.nextInt();
        int kolvo = sc.nextInt();
        double price = sc.nextDouble();

        double v = (b * c) + (kolvo * price);
        System.out.println(v);
    }
}
