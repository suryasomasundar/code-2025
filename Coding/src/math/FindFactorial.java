package math;

public class FindFactorial {

    public static int fndFactorial(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return n * fndFactorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fndFactorial(2));
        System.out.println(fndFactorial(3));
        System.out.println(fndFactorial(4));
        System.out.println(fndFactorial(5));

    }
}
