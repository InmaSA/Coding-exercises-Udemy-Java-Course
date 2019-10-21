public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int compareNum = Math.abs(number);
        while (compareNum > 0) {
            int lastDigit = compareNum % 10;
            reverse *= 10;
            reverse += lastDigit;
            compareNum /= 10;
        }
        if(reverse == Math.abs(number)) {
            return true;
        } return false;

    }
}
