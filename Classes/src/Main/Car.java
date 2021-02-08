package Main;

import java.util.Locale;

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

    //이중에 하나를 public으로 바꾸면 이제 접근이 가능하다.
    //하지만 이렇게 하면 encapsulation을 어긴 것이 되서 권장하지 않는다.
    //그래서 method를 선언해서 거기에서 접근할 수 있게 해주는것.
    //encapsulation은 따라서 '직접' 접근 하는 것을 막는 것이다.

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("porsche") || validModel.equals("kia")) {
            this.model = model;
            //이렇게 해줘서 비교를 하는 것이다.
        } else this.model = "unknown";

        //this을 입력하면 private String model로 인지된다.
        this.model = model; //사실 이게 setter이다.
    }
    //getter, setter 설정
    public String getModel() {
        return this.model; //이렇게 하면 저기 위의 private String model을 불러
        //온다고 꼭 기억해두자.
    }

    //결론적으로 getter, setter를 이용하는 이유는 이렇게 해야 접근이 가능하기 때문이다.
    //이렇게 해서 validation을 할 수 있다. 항상 직접 접근하는건 보안에 좋지 않다.
}
