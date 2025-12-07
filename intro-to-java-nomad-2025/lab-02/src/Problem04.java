import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int age = sc.nextInt();
        String city = sc.next();

        System.out.println("My name is " + name + ", I am " + age + " years old, I live in " + city +".");
    }
}
