import java.sql.SQLOutput;

public class NumberToWords {
    public static int reverse(int number) {
        int reverse = 0;

        while(number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;

            number /= 10;
        }

        return reverse;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if(number < 0) return -1;

        do {
            count++;
            number /= 10;
        } while(number != 0);

        return count;
    }

    public static void numberToWords(int number) {
        int count = getDigitCount(number);

        if(number < 0) System.out.println("Invalid Value");

        number = reverse(number);
        while(count > 0) {
            int digit = number % 10;

            if(digit == 0) System.out.println("Zero");
            else if(digit == 1) System.out.println("One");
            else if(digit == 2) System.out.println("Two");
            else if(digit == 3) System.out.println("Three");
            else if(digit == 4) System.out.println("Four");
            else if(digit == 5) System.out.println("Five");
            else if(digit == 6) System.out.println("Six");
            else if(digit == 7) System.out.println("Seven");
            else if(digit == 8) System.out.println("Eight");
            else System.out.println("Nine");

            number /= 10;
            count--;
        }
    }
}
