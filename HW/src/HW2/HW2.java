package HW2;

import HW.HW;

public class HW2 {
    public static double miles(int kilometer) {
        if(kilometer < 0) return -1;

        kilometer /= 2;
        kilos(2);
        return kilometer;
    }

    private static double kilos(int miles) {
        if(miles < 0) return -1;

        miles *= 2;

        System.out.println("대충 비번");

        return miles;
    }
}
