import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Min = 2000000000;
        int Max = -2000000000;
        while(true) {
            boolean check = scan.hasNextInt();
            if(!check) break;

            int val = scan.nextInt();
            scan.nextLine();

            if(Min > val) Min = val;
            if(Max < val) Max = val;
        }

        System.out.println("Minimum Value: " + Min + " Maximum Value: " + Max);
        scan.close();
    }
}
