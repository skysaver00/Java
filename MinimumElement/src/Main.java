import java.util.Scanner;

public class Main {
    private static int readInteger() {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        return num;
    }

    private static int[] readElements(int num) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[num];
        for(int i = 0; i < num; i++) {
            array[i] = scan.nextInt();
        }

        return array;
    }

    private static int findMin(int[] array) {
        int min = 99999999;
        for(int i = 0; i < array.length; i++) {
            if(min > array[i]) min = array[i];
        }

        return min;
    }
}
