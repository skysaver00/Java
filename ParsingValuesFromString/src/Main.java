import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String numberAsString = "2021";
        System.out.println("number as string = " + numberAsString);

        int number = Integer.parseInt(numberAsString);

        System.out.println("number as int = " + number);

        numberAsString += 9;
        number += 9;

        System.out.println(numberAsString + " " + number);
    }
}
