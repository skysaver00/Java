//191페이지 예제
/*import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.printf("a * 3 = %d\n", a * 3);
        System.out.println("a / 2 = " + (a / 2));
        System.out.print("a - 1 = " + (a - 1));
        scan.close();
    }
}*/

//195페이지 3번
/*import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.printf("%d", a + b);

        scan.close();
    }
}*/

//197페이지 8번
/*public class Test {
    public static void main(String args[]) {
        int a = 12, b = 5, sum = 2; //먼저 선언
        b *= a /= 4; //a /= 4 -> 3되고 b * a -> 5 * 3 - > 15 근데 아무렇게나 해도 상관 없음.
        sum += ++a * b-- / 4; //++a먼저 -> a = 4, b--니까 나중에 b = 15, sum += 4 * 15 / 4니까, 산술 먼저 -> 15를 sum에 추가 -> 2 + 15 -> 17
        System.out.printf("%d", sum); //17을 출력할 것이다.
    }
}*/

//198페이지 9번
/*public class Test {
    public static void main(String args[]) {
        int a = 5, b = 9, c;
        c = b % 5 < 5 ? 1 : 0; //% -> < -> ?:순서이다. b % 5 -> 4, 4 < 5 은 항상 맞다. 따라서 ? :중에 ?를 택해 c = 1이 된다.
        c = c | c << 3; //c << 3하고 비트 연산자. c << 3 -> 1000 -> 8, 0001 | 1000 -> 1001 -> 9가 된다.
        c = a < 5 || c >= 10 ? c - a : c + a; //a < 5아니다. c >= 10아니다. 따라서 :를 택해 c + a -> 9 + 5 -> 14가 된다.
        System.out.printf("%d", c); //14를 출력
    }
}*/