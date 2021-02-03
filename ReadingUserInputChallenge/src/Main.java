import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        for(int i = 1; i <= 10; i++) {
            System.out.println("Enter Number #" + i + ": ");
            boolean val = scan.hasNextInt();

            if(val) {
                int number = scan.nextInt();
                counter++;
                sum += number;
            }
            else {
                System.out.println("Invalid Number");
            }
            scan.nextLine();
        }

        System.out.println("Overall count: " + counter + ", Sum: " + sum);

        scan.close();
    }
}
