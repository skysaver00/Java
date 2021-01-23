public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) return false;

        int leapyear = 0;
        if(year % 4 == 0) leapyear++;
        if(year % 100 == 0) leapyear--;
        if(year % 400 == 0) leapyear++;

        switch (leapyear) {
            case 0:
                return false;

            case 1:
                return true;

            default:
                return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if(year < 1 || year > 9999) return -1;

        boolean leapyear = isLeapYear(year);

        switch(month) {
            case 1:
                return 31;

            case 2:
                if(leapyear == true) return 29;
                else return 28;

            case 3:
                return 31;

            case 4:
                return 30;

            case 5:
                return 31;

            case 6:
                return 30;

            case 7:
                return 31;

            case 8:
                return 31;

            case 9:
                return 30;

            case 10:
                return 31;

            case 11:
                return 30;

            case 12:
                return 31;

            default:
                return -1;
        }
    }
}
