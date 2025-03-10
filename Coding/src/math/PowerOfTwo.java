package math;

public class PowerOfTwo {

    public static boolean isPowerofTwo(int n) {

        if (n < 0) throw new IllegalArgumentException("n has to be a positive integer");

        if (n == 1) {
            return true;
        }

        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerofTwo(n));
    }
}
