public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if(number < 0) return -1;

        int count = 0;
        do {
            if(number % 2 == 0) {
                count += number % 10;
                number /= 10;
            }
            else number /= 10;
        } while(number != 0);

        return count;
    }
}
