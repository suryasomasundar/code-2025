package math;

public class PassPillow {

    public static int passPillow(int n, int time) {

        int cycleLength = 2 * (n - 1);
        int effectiveTime = time % cycleLength;

        if (effectiveTime < n) {
            return effectiveTime + 1;
        } else {
            return 2 * n - effectiveTime - 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(passPillow(5, 8));
        System.out.println(passPillow(4, 8));
        System.out.println(passPillow(5, 13));
        System.out.println(passPillow(5, 14));
    }
}
