import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int switchValue = 3;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5: case 6:
                System.out.println("Value was a 3 , 4 , 5 or 6");
                System.out.println("Actually it was a " + switchValue);
                break;

            default: //any other cases not above
                System.out.println("Was not 1 nor 2");
                break;
        }

        //more code here!

        char bet = 'A';

        switch(bet) {
            case 'A':
                System.out.println("Alphabet was A");
                break;

            case 'B':
                System.out.println("Alphabet was B");
                break;

            case 'C':
                System.out.println("Alphabet was C");
                break;

            case 'D':
                System.out.println("Alphabet was D");
                break;

            case 'E':
                System.out.println("Alphabet was E");
                break;
        }

        String month = "JaNuaRY";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
        }
    }
}
