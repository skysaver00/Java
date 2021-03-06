import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        for(int i = 0; i < array.length / 2 + 1; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println("Array = " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        reverse(array);
    }
}
