public class Main {

    public static void main(String[] args) {
        int sum = 10 + 15;
        int minus = 20 - 49;
        int mul = 15 * 12;
        int dvd = 12 / 5;

        System.out.println(sum + " " + minus + " " + mul + " " + dvd);

        //당연히 사칙연산도 가능
        int cal = 15 * 12 - 15 * 10;
        System.out.println(cal);

        cal = 10 * ((10 + 15) / (5) + 8);
        System.out.println(cal);

        cal *= cal;
        System.out.println(cal);

        int remain = 29 % 6;
        System.out.println(remain);

        int t = 100;
        System.out.println(t);
        t++;
        System.out.println(t);
        t--;
        System.out.println(t);

        boolean isAlien = false;
        if(isAlien == false) System.out.println("There is no alien!");
    }
}
