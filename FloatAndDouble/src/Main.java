import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        float MinFloat = Float.MIN_VALUE;
        float MaxFloat = Float.MAX_VALUE;

        System.out.println(MaxFloat + " " + MinFloat);

        double MinDouble = Double.MIN_VALUE;
        double MaxDouble = Double.MAX_VALUE;

        System.out.println(MaxDouble + " " + MinDouble);

        float myFloatValue = 5.25F; //float Primitive Type은 뒤에 F를 붙여줘야한다.
        double myDoubleValue = 5.25; //따라서 double이 부동소수점의 기본값.
        double alterDoubleValue = 5.25D; //하지만 D를 붙여줘도 무방하다.

        int t = 5 /3;
        double d = 5 / 3d;
        double dd = 5.0 / 3.0;
        float f = 5 / 3f;
        System.out.println(myFloatValue + " " + myDoubleValue + " " + alterDoubleValue);
        System.out.println(t + " " + d + " " + dd + " " + f); //print해보면 double이 더 길게 표현된다. 따라서 double이 훨씬 더 정확한 값을 표현한다.

        double pounds = 150;
        double kilo = pounds * 0.45359237;

        System.out.println(pounds + " " + kilo);

        double pie = 3.1415927d;
        double underscore = 3_000_000.4_567_890d; //역시 이렇게 표현이 가능하다.

        System.out.println(pie + " " + underscore);
        //BigDecimal이란 것도 있는데, 이후 double보다 더 정확한 계산을 할때 쓰게 된다.
    }
}
