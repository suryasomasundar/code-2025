package math;

public class PrintNthPrime {

    public static boolean isPrime(int n) {

        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int printNthPrime(int n) {

        if (n <= 0) throw new IllegalArgumentException("n has to be a a positive integer");

        int count = 0;
        int num = 2;

        while (count < n) {
            if (isPrime(num)) {
                count++;
            }

            if (count < n) {
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 1;
        int n3 = 51;
        int n4 = 0;
        int n5 = 100;
        System.out.println("The " + n1 + "th prime is --> " + printNthPrime(n1));
        System.out.println("The " + n2 + "th prime is --> " + printNthPrime(n2));
        System.out.println("The " + n3 + "st prime is --> " + printNthPrime(n3));
        System.out.println("The " + n5 + "th prime is --> " + printNthPrime(n5));
        System.out.println("The " + n4 + "th prime is --> " + printNthPrime(n4));


    }
}
