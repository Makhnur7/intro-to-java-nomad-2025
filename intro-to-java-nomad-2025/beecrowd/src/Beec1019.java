import java.util.Scanner;

public class Beec1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int h = n / 3600;
        int j = n % 3600;

        int m = j / 60;
        int s = j % 60;


        System.out.println(h +":"+ m + ":" + s);
    }
}
