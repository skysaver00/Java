import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " +anotherIntValue);

        anotherIntValue++;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " +anotherIntValue);
        //따라서 value에 직접 저장이 된다.

        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray;
        //이건 레퍼런스다. 레퍼런스로 같은 주소를 가르키고 있는것.

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray = " + Arrays.toString(anotherIntArray));

        anotherIntArray[1] = 1;
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray = " + Arrays.toString(anotherIntArray));
        //자동으로 업데이트 된다. 레퍼런스로 가져오는 거여서 그렇다.
        //따라서 value와 다르게 밑의 레퍼런스는 사실 같은 배열 -> 같은 주소를 잡고 있는것.

        modifyArray(myIntArray);
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray = " + Arrays.toString(anotherIntArray));

        anotherIntArray = new int[]{4,5,6,7,8};
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray = " + Arrays.toString(anotherIntArray));

    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array[3] = 4;
        array = new int[] {1, 2, 3, 4, 5};
        //그렇다고 되지는 않는다. 이 array는 새로 만들어진 레퍼런스가 된다는 뜻.
    }
}
