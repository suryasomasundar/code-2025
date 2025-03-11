package math;

public class PerfectNumber {

    public static boolean isPerfectNumber(int n) {

        int sum = 1;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i; // Add the divisor
                if (i != n / i) { // Add the complementary divisor (if different)
                    sum += n / i;
                }
            }
        }
        return sum == n && n != 1; // 1 is not a perfect number
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
    }
}
