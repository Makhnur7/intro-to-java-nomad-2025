import java.util.Scanner;

public class Beec1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = b*b - 4 * a * c;
        if(a == 0 || d < 0){
            System.out.println("Impossivel calcular");
        } else {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("r1 = " + r1);
            System.out.println("r2 = " + r2);

        }
    }
}
