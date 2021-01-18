public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        int num1 = (int) (first * 1000);
        int num2 = (int) (second * 1000);

        System.out.println(num1 + " " + num2);

        if(num1 == num2) return true;
        else return false;
    }
}
