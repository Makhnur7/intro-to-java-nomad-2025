import java.util.Scanner;

public class Beec1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int year = a / 365;
        int i = a % 365;

        int months = i / 30;
        int day = i % 30;

        System.out.println(year + " year");
        System.out.println(months + " months");
        System.out.println(day + " day");

        }

}
