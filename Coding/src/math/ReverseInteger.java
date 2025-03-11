package math;

public class ReverseInteger {

    public static int reverseInteger(int x) {

        if (x == 0) return 0;

        int reverse = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;

            reverse = reverse * 10 + pop;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int num = 123;
        int num2 = -1234;
        int num3 = 0;
        System.out.println(reverseInteger(num));
        System.out.println(reverseInteger(num2));
        System.out.println(reverseInteger(num3));
    }
}
