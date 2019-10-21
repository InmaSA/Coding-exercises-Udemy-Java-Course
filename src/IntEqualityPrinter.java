public class IntEqualityPrinter {

    public static void printEqual (int firstNumber, int secondNumber, int thirdNumber) {
        if(firstNumber < 0 || secondNumber < 0 || thirdNumber < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.println("All numbers are equal");
            return;
        }
        if (firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber) {
            System.out.println("All numbers are different");
            return;
        }
        System.out.println("Neither all are equal or different");
    }
}
