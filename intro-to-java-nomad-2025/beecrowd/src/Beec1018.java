import java.util.Scanner;

public class Beec1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);

        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        for (int nota : notas) {
            int u = a / nota;
            System.out.println(u + "nota(s)" + nota);
            a = a % nota;
        }

    }
}