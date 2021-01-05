public class Main {

    public static void main(String[] args) {
        //byte 근데 진짜 안쓴다.
        //short 이건 크기도 작고 탐색하기도 쉬어서 많이 쓴다.
        //int 제일 많이쓴다.
        //long 제일 많이쓴다.
        //float double이 있어서 안쓴다.
        //double 제일 많이쓴다.
        //char
        //boolean T/F여서 확인용으로 쓴다.

        String word = "Hello World!\n";
        //char말고 String이라고 문자열을 저장할 수 있다. char word[]같은 느낌으로 사용하면 된다. 크기의 제한은 메모리의 한계거나 int의 최대치이다. 따라서 약 21억이다.
        System.out.println(word + "or Just Print out Hello World!");

        String word2 = "One" + "Two" + "Three" + "Four" + "Five";
        System.out.println(word2); //당연하지만 띄어쓰기는 신경안써준다.

        String notint = "250.55";
        notint = notint + "40.99";
        System.out.println(notint); //당연히 숫자계산은 하지 않는다.

        String laststring = "10";
        int addstring = 50;
        laststring = laststring + addstring; //이렇게는 더할 수 있는데, 반대로 int = int + string은 바로 삑사리 난다.
        System.out.println(laststring); //당연히 String은 계산연산 안해준다.

        //String은 immutable이라고 해서 변경할 수 없다. 따라서 string은 만들어진 뒤에는 바꿀수 없다.
        //바꾸진다고 생각하는 이유는 새로운 string으로 아예 바뀌었기 때문이다. 수정 X, 새로운 레퍼런스를 만들고, 값을 부여, 그리고 레퍼런스를 주는것이다.

        //250.55에서 40.99를 추가한게 아니라 새곳에서 250.55에 40.99를 뒤에 붙여넣고, 그것을 String에 연결 시킨 것이다.

        //하지만 StringBuffer는 바꿀 수 있다. 하지만 String은 절대로 바꾸는게 아니다.
    }
}
