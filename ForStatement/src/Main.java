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
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
