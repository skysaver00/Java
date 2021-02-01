public class LargestPrime {
    public static int getLargestPrime(int number) {
        if(number <= 0) return -1;

        int factor = number;
        while(factor > 1) {
            if(number % factor == 0) {
                int k = 1;
                int count = 0;
                do {
                    if(factor % k == 0) count++;
                    k++;
                } while(k <= factor);

                if(count == 2) return factor;
            }

            factor--;
        }

        return -1;
    }
}
