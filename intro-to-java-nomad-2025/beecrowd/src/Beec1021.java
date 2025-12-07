import java.util.Scanner;

public class Beec1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        System.out.println("Notas:");
        int[] notas = {100, 50, 20, 10, 5, 2};
        for(int nota : notas ){
            double u = a / nota;
            System.out.println(u + " Notas"+ nota);

            a = a % nota;


        }
    }
}
