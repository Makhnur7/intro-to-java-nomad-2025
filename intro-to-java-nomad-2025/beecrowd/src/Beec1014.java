import java.util.Scanner;

public class Beec1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        double y = sc.nextDouble();

        double km = x / y;
        System.out.println( km + " km/l");
    }
}
