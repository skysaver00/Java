import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[25];
        for(int i = 0 ; i < 10; i++) {
            myIntArray[i] = i * 10;
        }

        double[] myDoubleArray = { 0.0, 10.0, 20.0, 30.0, 40.0, 50.0, 60.0,
                70.0, 80.0, 90.0, 100.0};

        for(int i = 0 ; i < 10; i++) {
            System.out.print(myIntArray[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < 10; i++) {
            System.out.print(myDoubleArray[i] + " ");
        }
        System.out.println();

        System.out.println("또는 이렇게 할 수 있다.");
        printArray(myIntArray);
        printArray(myDoubleArray);

        System.out.println("입력 시작");
        int[] myIntegers = getIntegers(5);

        for(int i = 0; i < myIntegers.length; i++) {
            System.out.println(myIntegers[i]);
        }

        System.out.println(getAverage(myIntegers));
    }

    public static void printArray(int[] array) {
        for(int i = 0 ; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

    public static void printArray(double[] array) {
        for(int i = 0 ; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

    public static int[] getIntegers(int numbers) {
        Scanner scan = new Scanner(System.in);
        System.out.println(+numbers+"의 숫자를 입력하세요: ");
        int[] values = new int[numbers];

        for(int i = 0; i < values.length; i++) {
            values[i] = scan.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double) array.length;
    }
}
