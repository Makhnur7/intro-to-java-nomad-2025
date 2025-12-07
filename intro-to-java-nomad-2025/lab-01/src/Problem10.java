public class Problem10 {
    public static void main(String[] args){
        int s = 14;
        double sm = s / 1.6;
        int minutes = 45;
        int seconds = 30;

        double v = s / (minutes / 60.0 + seconds / 3600.0);
        double vm = sm / (minutes / 60.0 + seconds / 3600.0);
        System.out.println("v = " + v);
        System.out.println("v in miles = " + vm);
    }
}
