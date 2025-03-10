package math;

public class PowerOfFour {

    public static boolean isPowerofFour(int n) {

        if (n < 0) throw new IllegalArgumentException("n has to be a positive integer");

        if (n == 1) {
            return true;
        }

        while (n > 1) {
            if (n % 4 != 0) {
                return false;
            }
            n = n / 4;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerofFour(n));
    }
}
