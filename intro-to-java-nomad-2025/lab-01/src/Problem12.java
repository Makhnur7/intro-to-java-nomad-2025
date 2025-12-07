public class Problem12 {
    public static void main(String[] args) {
        int miles = 24;
        double s = miles * 1.6;
        int hour = 1;
        int minutes = 45;
        int seconds = 35;

        double v = s / (hour + minutes / 60.0 + seconds / 3600.0);
        System.out.println(" v = " + v);

    }
}
