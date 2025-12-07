import java.util.Scanner;
import static java.lang.Math.*;

public class Beec1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        double pi = 3.14159;

        double TRIANGULO = (a * c) / 2.0;
        double CIRCLE = pi * c * c;
        double TRAPEZIUM = ((a + b) * c) / 2.0;
        double QUADRADO = b * b;
        double RETANGULO = a * b;

        System.out.println("TRIANGULO =" + TRIANGULO);
        System.out.println("CIRCLE =" + CIRCLE);
        System.out.println("TRAPEZIUM =" + TRAPEZIUM);
        System.out.println("QUADRADO =" + QUADRADO);
        System.out.println("RETANGULO =" + RETANGULO);
    }
}
