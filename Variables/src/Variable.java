import java.sql.SQLOutput;

public class Variable {

    public static void main(String[] args) {
        int myFirstNumber = 10;
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = 1000 - myTotal;

        System.out.println(myTotal + ", " + myLastOne); //sout하고 탭해면 바로 나옴
        System.out.println("myFirstNumber");
    }
}
