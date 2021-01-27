public class GreatestCommonDevisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10) return -1;

        int numator = 1;

        int gcd = 1;

        int big;
        if(first >= second) big = first;
        else big = second;

        do {
            if(first % numator == 0 && second % numator == 0) {
                gcd = numator;
            }
            numator++;
        } while(numator != big);

        return gcd;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(10, 20));
    }
}
