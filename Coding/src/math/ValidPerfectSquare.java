package math;

public class ValidPerfectSquare {

    public static boolean isPerfectSquareMath(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    public static boolean isPerfectSquare(int n) {
        int x = n;
        while (x * x > n) {
            x = (x + n / x) / 2;
        }
        return x * x == n;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquareMath(4));
        System.out.println(isPerfectSquareMath(8));
        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(25));

    }
}
