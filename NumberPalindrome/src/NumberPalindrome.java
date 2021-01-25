public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int num2 = number;
        int check = 0;

        if (num2 < 0) num2 *= -1;
        while (num2 != 0) {
            check += num2 % 10;
            num2 /= 10;
            check *= 10;
        }
        check /= 10;

        if (number < 0) number *= -1;

        if (number == check) return true;
        else return false;
    }
}
