public class Main {

    public static void main(String[] args) {
        int count = 1;
        while(count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        for(count = 1; count != 6; count++) {
            System.out.println("Count value is " + count);
        }

        count = 1;
        while(true) {
            if(count == 6) break;
            System.out.println("Count value is " + count);

            count++;
        }

        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        }while(count != 6);

        int number = 4;
        do {
            if(isEvenNumber(number) == true) System.out.println(number + " is Even!");
            else System.out.println(number + " is odd...");

            number++;
        }while(number <= 100);

        int num2 = 1;
        int count2 = 0;
        while(count2 != 5) {
            if(isEvenNumber(num2) == true) {
                System.out.println(num2 + " is even. count: " + count2);
                count2++;
            }
            num2++;
        }
    }

    public static boolean isEvenNumber(int number) {
        if((number % 2 == 0)) return true;
        else return false;
    }
}
