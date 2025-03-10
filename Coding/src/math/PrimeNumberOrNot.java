package math;

public class PrimeNumberOrNot {

    public static boolean isPrimeNumber(int n) {

        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { // Reminder
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 10;
        int n3 = 0;
        int n4 = -1;
        int n5 = 19;
        System.out.println("The Number 7 is Prime --> " + isPrimeNumber(n1));
        System.out.println("The Number 10 is Prime --> " + isPrimeNumber(n2));
        System.out.println("The Number 0 is Prime --> " + isPrimeNumber(n3));
        System.out.println("The Number -1 is Prime --> " + isPrimeNumber(n4));
        System.out.println("The Number 19 is Prime --> " + isPrimeNumber(n5));

    }
}
