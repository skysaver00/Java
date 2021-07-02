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
/*public class Test {
    public static void main(String args[]) {
        int ary[][] = new int[3][5]; //1번, 2번 빈칸 -> i, j가 각각 들어가니까 i = 3, j = 5 따라서 3, 5가 들어간다.
        int n = 1;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 5; j++) {
                ary[i][j] = j * 3 + i + 1;
                System.out.print(ary[i][j] + " ");
            }
            System.out.println();
        }
    }
}*/

//205페이지 3번
/*public class Test {
    public static void main(String args[]) {
        int i = 0, c = 0;
        while(i < 10) {
            i++;
            c *= i;
        }
        System.out.println(c); //c = 0 * 0 -> 0 * 1 -> 0 * 2 -> 0 * 3 -> .... 0 * 9해서, 0은 단 한번 출력이 된다....
    }
}*/

//205페이지 4번
/*public class Test {
    public static void main(String args[]) {
        int a = 0, sum = 0;
        while(a < 10) {
            a++; //a = 1, 2, 3, ..... 9, 10까지 10이되고 다시 맨 위로 올라가면, 반복문을 탈출한다.
            if(a % 2 == 1) continue; //a % 2 == 1 -> 1, 3, 5, 7, 9는 continue되서 while맨 위로 되돌아간다.
            sum += a; //여기까지 오는 경우는 a = 2, 4, 6, 8, 10일때, sum = 30이 된다.
        }
        System.out.println(sum); //30을 출력한다.
    }
}*/

//208페이지 10번
/*public class Test {
    public static void main(String[] args) {
        int i, hap = 0;
        for(i = 1; i <= 10; ++i) {
            System.out.println(i);
            hap += i; //이거 조심해야한다. ++i라 하더라도, 1, 2, 3, 4, 5, 6, 즉 1부터 더해진다. 10까지 더하게 된다.
        }
        System.out.printf("%d, %d\n", i, hap); //11, 55출력. 하지만 마지막 i의 종착은 11이다.
    }
}*/

//209페이지 12번
/*public class Test {
    public static void main(String[] args) {
        int[][] a = {{11, 12, 13, 14}, {21, 22, 23, 24}};
        int hap = 0;
        for(int i[]: a) //범위 i[]기준이니까, [0][], [1][]을 돈다.
        {
            for(int j : i) //[0][]에는 4개 [1][]에도 4개
                hap = hap + j; //11 + 12 + 13 + 14 + 21 + 22 + 23 + 24 => 40 + 10 +80 + 10
        }
        System.out.printf("%d", hap); //140이 정답.
    }
}*/

//210페이지 13번
/*import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); //8들어오고
        int b = scan.nextInt(); //3들어온다.
        char c = 'G';

        if(a > 10 && b < 10) { //틀림
            if(a - b < 5 || a > 15)
                c = 'X';
        } else if(a > 5 && b < 5) { //맞음
            if(a - b < 3 || b > 0) //a - b = 5 < 3 || b > 3 -> 맞음
                c = 'Y'; //c = Y
        } else
            c = 'Z';
        System.out.printf("%c", c); //Y출력
        scan.close();
    }
}*/

//211페이지 14번
/*public class Test{
    public static void main(String[] args) {
        String str = "Programming";
        int n = str.length(); //Programming은 11글자
        char[] st = new char [n]; //st에 11만큼 들어감.
        n--;
        for(int k = n; k >= 0; k--) {
            st[n - k] = str.charAt(k); //이거 뒤집어진다.
        }
        for(char k : st) {
            System.out.printf("%c", k); //k : st만큼 출력 //gnimmargorP가 될거같다.
        }
    }
}*/