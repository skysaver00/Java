public class Main {
    public static void main(String[] args) {
        double FeetAndInch = calcFeetAndInchesToCentimeters(5, 7);
        System.out.println("Height is " + FeetAndInch + " Centimeters.");

        double onlyInch = calcFeetAndInchesToCentimeters(100);
        System.out.println("Height is " + onlyInch + " Centimeters.");

    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if(feet < 0) return -1;
        if(inches < 0 || inches > 12) return -1;

        double overallinches = (feet * 12 + inches) * 2.54;

        return overallinches;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if(inches < 0) return -1;

        return calcFeetAndInchesToCentimeters(inches / 12, inches % 12);
    }
}
