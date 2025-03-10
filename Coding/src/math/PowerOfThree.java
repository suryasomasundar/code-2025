package math;

public class PowerOfThree {

    public static boolean isPowerofThree(int n) {

        if (n < 0) throw new IllegalArgumentException("n has to be a positive integer");

        if (n == 1) {
            return true;
        }

        while (n > 1) {
            if (n % 3 != 0) {
                return false;
            }
            n = n / 3;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(isPowerofThree(n));
    }
}
