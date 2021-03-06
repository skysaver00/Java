package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Max value = " + (myMaxIntValue + 1)); //overflow -> 컴퓨터에 너무 큰 값을 넣으려고 하면 발생 어쨌든 넣으려고 하면 이렇게 마이너스로 변한다.
        System.out.println("Busted Min value = " + (myMinIntValue - 1)); //underflow -> 컴퓨터에 너무 작은 값을 넣으려고 하면 발생

        int max = 2_147_483_647; //이렇게 숫자를 적을 수도 있다.
        System.out.println(max);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;
        long mydLongValue = 2_147_483_648L;//뒤에 L을 붙이지 않으면 Int로 인식해서 에러를 만든다.
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Value = " + myMinLongValue);
        System.out.println("Long Value = " + myMaxLongValue);
        System.out.println("Long Value = " + myLongValue);

        int myTotal = (myMinIntValue / 2);
        System.out.println("myTotal = " +myTotal);

        //byte myNewByteValue = (myMinByteValue / 2); 이것은 오류가 난다. 이게 (myMin / 2)를 하면 자바에서 int로 인식하는데, byte에 넣으려고 하니까 문제가 생기는 거임.
        /*casting -> 변수를 한타입에서 다른 타입으로 변환하는 거다. (byte) (myMinByteValue / 2)이렇게 쓰면 기존의 / 2로 만들어진 int값에서 byte로 변경이 된다.
         */

        byte myNewByteValue = (byte) (myMinByteValue / 2) ;
        //short도 가능하고, 다른거 모두 가능하다.
    }
}
