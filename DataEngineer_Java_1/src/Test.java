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

//201페이지 예제
/*public class Test {
    public static void main(String args[]) {
        String str = "agile";
        int x[] = {1, 2, 3, 4, 5}; //배열 5개가 만들어진다.
        char y[] = new char[5]; //아직 채워지지 않은 문자열 배열이 만들어진다.
        int i = 0;
        while(i < str.length()) { //i < 5일동안, str.length = 5다.
            y[i] = str.charAt(i); //y[0] = 'a', 'g', 'i', 'l', 'e'가 각각 들어가게 된다.
            i++;
        }
        for(int p : x) {
            i--;
            System.out.print(y[i]); //e, l, i, g, a가 출력되고
            System.out.print(p + " "); //1, 2, 3, 4, 5가 같이 출력된다.
        }
    }
}*/

//204페이지 1번
/*public class Test {
    public static void main(String args[]) {
        int a[] = new int[8];
        int i = 0;
        int n = 10;
        while(n != 0) { //1번 빈칸 n이 0이 될때까지 n을 2진수로 저장해야한다.
            a[i++] = n % 2; //2번 빈칸 n % 2가 들어간다. 이렇게 하면 n의 나머지를 바로 보고 저장 가능.
            n /= 2;
        }
        for(i = 7; i >= 0; i--)
            System.out.print(a[i]); //이거의 답은 a[3]까지 0 -> 00001010이 된다.
    }
}*/

//204페이지 2번