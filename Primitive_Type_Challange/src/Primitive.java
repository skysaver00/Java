public class Primitive {

    public static void main(String[] args) {
        byte num1 = 10;
        short num2 = 200;
        int num3 = 3000;

        long num4 = num1 + num2 + num3;

        num4 *= 10;
        num4 += 50000;

        System.out.println(num4);
    }
}
