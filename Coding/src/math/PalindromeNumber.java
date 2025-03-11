package math;

public class PalindromeNumber {

    public static boolean isPalindromeNumber(int n) {

        int reverse = 0;
        int original = n;

        while (n != 0) {
            int pop = n % 10;
            n /= 10;

            reverse = reverse * 10 + pop;
        }
        return reverse == original;
    }

    public static void main(String[] args) {
        int num1 = 121;
        int num2 = 123;
        int num3 = -121;
        int num4 = 0;
        System.out.println(isPalindromeNumber(num1));
        System.out.println(isPalindromeNumber(num2));
        System.out.println(isPalindromeNumber(num3));
        System.out.println(isPalindromeNumber(num4));

    }
}
