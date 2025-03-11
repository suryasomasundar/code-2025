package math;

public class PrintNthFibonacci {

    public static int printNthFib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return printNthFib(n - 1) + printNthFib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(printNthFib(0));
        System.out.println(printNthFib(1));
        System.out.println(printNthFib(2));
        System.out.println(printNthFib(3));
        System.out.println(printNthFib(4));
        System.out.println(printNthFib(5));
        System.out.println(printNthFib(6));
        System.out.println(printNthFib(7));
        System.out.println(printNthFib(8));
        System.out.println(printNthFib(9));
        System.out.println(printNthFib(10));

    }
}
