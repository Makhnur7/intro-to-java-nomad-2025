import java.util.Scanner;

public class work {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            boolean b = true;
            for (int i = 2; i < Math.sqrt(a); i++){
                if (a % i ==0){
                    b = false;
                    break;
                }

            }
            System.out.println(a + " " + b);
        }

}
