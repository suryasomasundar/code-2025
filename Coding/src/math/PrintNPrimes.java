package math;

public class PrintNPrimes {

    public static boolean isPrime(int n) {

        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] printNPrimes(int n) {

        int count = 0;
        int num = 2;
        int[] primes = new int[n];

        while (count < n) {
            if (isPrime(num)) {
                primes[count] = num;
                count++;
            }
            num++;
        }
        return primes;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] output = printNPrimes(n);
        for (int result : output) {
            System.out.println(result + "");
        }
    }
}
