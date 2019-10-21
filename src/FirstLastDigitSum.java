public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        else if (number < 10) {
            return number * 2;
        }

        int firstNumber = 0;
        int lastNumber = number % 10;

        while (number >= 10) {
            firstNumber = number / 10;
            number /= 10;
        }
        return firstNumber + lastNumber;
    }
}
