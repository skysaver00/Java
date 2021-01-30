import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System. in);

        BigInteger all = new BigInteger(in.next());
        BigInteger dif = new BigInteger(in.next());

        BigInteger Klaudia = (all.add(dif)).divide(new BigInteger("2"));
        BigInteger Natalia = (all.subtract(Klaudia));

        System.out.println(Klaudia.toString());
        System.out.println(Natalia.toString());
    }
}
