public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }

        int digitInA = 0;
        int digitInB = 0;

        while (a > 0) {
            digitInA = a % 10;
            while (b > 0) {
                digitInB = b % 10;
                if (digitInA == digitInB) {
                    return true;
                }
                System.out.println(digitInA);
                System.out.println(digitInB);
                b /= 10;
            }
            a /= 10;


        }
        return false;
    }
}