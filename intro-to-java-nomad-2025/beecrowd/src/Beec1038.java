import java.util.Scanner;

public class Beec1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double price;

        if(x == 1){
            price = 4.0;
        } else if (x == 2) {
            price = 4.50;
        } else if (x == 3) {
            price = 5.0;
        } else if (x == 4) {
            price = 2.0;
        } else if (x == 5) {
            price = 1.50;
        } else {
            System.out.println("you are stypid");
            return;
        }
        double total = price * y;
        System.out.println(total);
    }
}
