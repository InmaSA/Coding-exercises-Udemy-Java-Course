public class main {

    public static void main(String[] args) {
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        System.out.println(AreaCalculator.area(0.0));
        MinutesToYearsDaysCalculator.printYearsAndDays(- 525600);
        IntEqualityPrinter.printEqual(1,2,1);
        System.out.println(PlayingCat.isCatPlaying(false, 35));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2020));
        System.out.println(SumOddRange.sumOdd(100,00));

        System.out.println(NumberPalindrome.isPalindrome(-1221));
        System.out.println(NumberPalindrome.isPalindrome(-11212));

        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(10));

        System.out.println(EvenDigitSum.getEvenDigitSum(252));

        System.out.println(SharedDigit.hasSharedDigit(12, 13));
        System.out.println("***********************");
        System.out.println(LastDigitChecker.hasSameLastDigit(90, 97, 999));
        System.out.println("***********************");
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));
    }
}
