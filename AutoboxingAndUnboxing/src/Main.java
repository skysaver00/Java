import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Hello");
        strArrayList.add("World!");

        //ArrayList<int> intArrayList = new ArrayList<int>();
        //이건 안된다. 이거는 위의 IntClass를 통해서 선언해준다.

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(55));

        Integer integer = new Integer(51);
        Double doubleValue = new Double(25.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            intArrayList.add(i * 5);
            intClassArrayList.add(new IntClass(i * 6));
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(" --> " + intArrayList.get(i).intValue());
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(intClassArrayList.get(i).getMyValue());
        }

        //Integer myValue = 51.2; //이거 당연히 안된다.
        Integer myIntValue = 56 / 2;
        int myInt = myIntValue.intValue();
        System.out.println(" ===> " + myInt);

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double l = 0.0; l <= 10.0; l += 0.05) {
            myDoubleValues.add(Double.valueOf(l));
        }

        for(int i = 0; i < myDoubleValues.size(); i++) {
            if(i % 2 == 0) {
                System.out.println(i + " --> " + myDoubleValues.get(i).doubleValue());
            } else {
                System.out.println(i + " -> " + myDoubleValues.get(i).doubleValue());
            }
        }
    }
}
