public class Problem04 {
    public static void main(String[] args) {
        System.out.println("a\ta^2\ta^3");
        for (int i = 1; i < 5; i++){
            int v = i * i;
            int j = i* i* i;
            System.out.println(i + "   " + v + "   " + j);
        }
    }
}
