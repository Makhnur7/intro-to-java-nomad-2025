public class Problem11 {
    public static void main(String[] args) {
        long a = 312032486;
        int s = 365 * 24 * 60 * 60;
        double birth = s / 7.0;
        double death = s / 13.0;
        double immigrant = s / 45.0;
        System.out.println("jdiejfi");

        for (int year = 1; year <= 5 ; year++){
            a += birth - death + immigrant;
            System.out.println("Year = "+ year + ": " + a);
        }

    }
}
