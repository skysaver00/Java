public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        int count = 0;
        int num = 0;

        if(number < 0) return -1;

        int fakenum = number;
        do {
            count++;
            fakenum /= 10;
        } while(fakenum != 0);

        num += number % 10;

        int tens = 1;
        for(int i = 0; i < count - 1; i++) {
            tens *= 10;
        }

        num += number / tens;

        return num;
    }
}
