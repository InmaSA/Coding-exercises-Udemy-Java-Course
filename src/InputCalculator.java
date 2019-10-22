import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);


        int sum = 0;
        int average = 0;
        int counter = 0;

        while(true) {
            boolean isNum = scanner.hasNextInt();
            if(isNum) {
                int number = scanner.nextInt();
                scanner.nextLine();
                counter ++;

                sum = sum + number;
                average = (int) Math.round(sum / counter);
            } else {
                 break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();

    }
}
