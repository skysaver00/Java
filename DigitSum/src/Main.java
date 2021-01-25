public class Main {
    public static int sumDigits(int number) {
        if(number < 10) return -1;

        int value = 0;
        while(number != 0) {
            value += number % 10;
            number /= 10;
        }

        return value;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(238));
        System.out.println(sumDigits(-85));
        System.out.println(sumDigits(7));
        System.out.println(sumDigits(58437));
    }
}
