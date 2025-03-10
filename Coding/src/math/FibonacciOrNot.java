package math;

public class FibonacciOrNot {

    public static boolean isPerfectSquare(int n) {

        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    public static boolean isFibonocci(int n) {

        if (n < 0) throw new IllegalArgumentException("n has to be a positive integer");

        if (n == 0 || n == 1) {
            return true;
        }
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 1;
        int n3 = -5;
        int n4 = 7;

        System.out.println("The Number " + n1 + " is a Fibonacci --> " + isFibonocci(n1));
        System.out.println("The Number " + n2 + " is a Fibonacci --> " + isFibonocci(n2));
        System.out.println("The Number " + n4 + " is a Fibonacci --> " + isFibonocci(n4));
        System.out.println("The Number " + n3 + " is a Fibonacci --> " + isFibonocci(n3));

    }
}
