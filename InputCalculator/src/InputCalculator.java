import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scan = new Scanner(System.in);

        int a;
        int sum = 0;
        int avg = 0;
        while(true) {
            boolean isInt = scan.hasNextInt();

            if(!isInt) break;
            else {
                a = scan.nextInt();
                scan.nextLine();
            }

            sum += a;
            avg++;
        }

        if(avg == 0) avg++;

        System.out.println("SUM = " + sum + " AVG = " + ((long)Math.round((double)sum / avg)));
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
