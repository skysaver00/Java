public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if(num1 > 99 || num1 < 10 || num2 > 99 || num2 < 10) return false;

        int dnum2 = num2;
        int dnum1 = num1;
        for(int i = 0; dnum1 > 0; i++) {
            while(dnum2 != 0) {
                int one = dnum1 % 10, two = dnum2 % 10;
                if(one == two) {
                    return true;
                }
                dnum2 /= 10;
            }

            dnum1 /= 10;
            dnum2 = num2;
        }

        return false;
    }
}
