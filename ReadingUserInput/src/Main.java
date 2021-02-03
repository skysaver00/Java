import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = scan.nextLine();
        System.out.print("Enter Your Year of Birth: ");
        int yearofbirth = scan.nextInt();
        scan.nextLine();

        System.out.println("Your name is " + name);
        System.out.println("Your Birth Year is " + yearofbirth);
        System.out.println("You are " + (2021 - yearofbirth) + " years old.");
        scan.close();
    }
}
