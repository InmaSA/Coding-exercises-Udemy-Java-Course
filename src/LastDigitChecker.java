public class LastDigitChecker {

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }

        int lastANumber = a % 10;
        int lastBNumber = b % 10;
        int lastCNumber = c % 10;

        return (lastANumber == lastBNumber || lastANumber == lastCNumber || lastBNumber == lastCNumber);

    }

    public static boolean isValid(int number) {
        return (number >= 10 && number <= 1000);
    }

}

