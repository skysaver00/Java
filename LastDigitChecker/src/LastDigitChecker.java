public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if(a < 10 || a > 1000) return false;
        if(b < 10 || b > 1000) return false;
        if(c < 10 || c > 1000) return false;

        int aa = a % 10;
        int bb = b % 10;
        int cc = c % 10;

        if(aa == bb || bb == cc || aa == cc) return true;
        else return false;
    }

    public static boolean isValid(int num) {
        if(num < 10 || num > 1000) return false;
        else return true;
    }
}
