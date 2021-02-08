package Main;

//public -> 제한되지 않은 접근이 가능. 거의 대부분 이거 사용
//private -> 어떤 클래스도 해당 클래스에 접근 불가능.
//protected -> 해당 패키지 내에 있는 클래스만 접근 가능.
public class Car {
    //variable -> 클래스 자체에서 선언 가능 -> 전역변수. method내에서 선언 -> 지역변수
    //encapsulation -> 필드, 메소드를 숨기기 위함. public하게 접근하지 않게 하기 위함.

    private int doors;
    //이렇게 해야 클래스 내에서만 접근이 가능.

    private int wheels;
    private String model;
    private String engine;
    private String color;
    //5개 모두 클래스 내에서만 접근이 가능.

    //클래스는 그저 청사진. 청사진은 설계도일 뿐이다.
    //객체가 필요하다. 청사진을 받아서 이를 실체를 만드는 애가 필요하다는 것.
    //Object는 Main class에서 만들 예정.
}
