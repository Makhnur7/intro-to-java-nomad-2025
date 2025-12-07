import java.util.Scanner;

public class Beec1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double c = (a + b) / 2;
        System.out.printf("MEDIA = %.5f\n", c );
    }
}
