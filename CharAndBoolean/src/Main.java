public class Main {

    public static void main(String[] args) {

        char letter = 'D'; //한 문자만 쓰려면 이렇게 ''를 쓴다 세미콜론 하나. 그리고 char는 단어 하나만 쓸 수 있다. char는 유니코드를 위해 16비트를 사용한다. 따라서 2바이트다.
        char unicode = '\u0044'; //이렇게 해서 유니코드를 쓸 수 있다.

        System.out.println(letter + " " + unicode);
        char unicode2 = '\u076E';
        System.out.println(unicode2); //저 unicode2는 아랍문자였다.
        char unicode3 = '\u00A9';
        System.out.println(unicode3); //이렇게 심볼도 가능하다.

        boolean t = true;
        boolean f = false;
        System.out.println(t + " " + f);

        boolean isCar = false;
        if(isCar) {
            System.out.println("This is not supposed to show");
        }

        boolean wasCar = true;
        wasCar = isCar? true : false;
    }
}
