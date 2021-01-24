public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));
        System.out.println("10,000 at 7.039% interest = " + calculateInterest(10000.0, 7.039));

        //for(init; termination; increment) 시작하는 숫자, 끝나는 숫자, 증가하는 값!
        for(int i = 0 ; i < 5; i++) {
            System.out.println("Loop " + i + " Hello!");
        }

        System.out.println("************ > _ < ************");
        for(int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, (double) i)));
        }

        System.out.println("************ > _ < ************");
        for(int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, (double) i)));
        }

        int count = 0;
        for(int i = 10; i < 500; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number.");
                if(count == 300) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if(n == 1) return false;

        for(int i = 2; i <= n / 2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
