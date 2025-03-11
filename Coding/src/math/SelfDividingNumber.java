package math;

public class SelfDividingNumber {

    public static boolean isSelfDividing(int n) {

        if (n <= 0) return false;

        int temp = n;
        while (temp != 0) {
            int rem = temp % 10;
            if (rem == 0 || n % rem != 0) {
                return false;
            }
            temp = temp / 10;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSelfDividing(128));
        System.out.println(isSelfDividing(121));
        System.out.println(isSelfDividing(36));
    }
}
