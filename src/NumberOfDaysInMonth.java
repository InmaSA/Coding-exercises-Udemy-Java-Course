public class NumberOfDaysInMonth {
    public static boolean isLeapYear (int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0 && year % 400 > 0) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public static int getDaysInMonth (int month, int year) {
        int answer = -1;
        if (month >= 1 && month <= 12 && year >= 1 && year <= 9999) {
            switch (month) {
                case 4: case 6: case 9: case 11:
                    answer = 30;
                    break;
                case 2:
                    if (isLeapYear(year)) {
                        answer = 29;
                    } else {
                        answer = 28;
                    }
                    break;
                default:
                    answer = 31;
                    break;
            }
        }
        return answer;
    }
}
