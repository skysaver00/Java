public class Main {
    /*
    overloading은 다른 메소드를 같은 이름으로 지정하면서 다른 파라미터를 쓰는 것이다.
    이는 이전에 constructor를 통해 충분히 알 수 있다.
    constructor를 통해 good constructor는 더 많이 파라미터를 포괄하는 메소드에게
    method를 넘겨주는 것이라고 했다.
     */

    private int a;
    private int b;
    private int x;
    private int y;

    public Main() {
        this(0, 0);
    }

    public Main(int x, int y) {
        this(0, 0, x, y);
    }

    public Main(int a, int b, int x, int y) {
        this.a = a;
        this.b = b;
        this.x = x;
        this.y = y;
    }//이렇게 말이다.

    //overloading은 하나의 단일 클래스에서 일어나는 경우가 대부분.
    //하지만 inheritance를 통해 여러 클래스에서 일어날 수 있다.

    //overriding은 같은 이름, 같은 파라미터를 가지고 있다.
    //inheritance에서 일어나게 된다.

    /*
    예를 들어, bark() 멍멍인데,
    class 시베리안_허스키 라서 bark()를 @Override하게 되면,
    bark()메소드를 멍멍이 아닌 월월!로 바꿀 수 있다.

    하지만 overloading은 같은 이름, 다른 파라미터를 가지게 된다.
     */

    /* overloading vs overriding
    overloading -> 메소드 재사용, 다른 파라미터
    단일 클래스 하지만 child class에서 overloading 가능
    ***반드시 다른 파라미터 가진다***
    **다른 return 타입 가능**
    private proteccted public 변환 가능.
    다른 예외 처리 가능


    overriding -> 항상 parent에서 inherit된 클래스에서 사용
    따라서 2개의 클래스가 반드시 필요.
    ***항상 같은 파라미터 가진다***
    같은 return 타입.
    수준이 낮은 private -> public 불가.
    하지만 public -> private가능
    예외처리 불가
     */
}
