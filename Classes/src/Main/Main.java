package Main;

public class Main {
    public static void main(String[] args) {
        //Car 클래스 청사진을 여기서 객체로 실체화 한다.
        Car porsche = new Car(); //이렇게 해야 초기화가 된다. 이렇게 꼭 new를
        Car kia = new Car(); //붙여주자.
        Car tesla = new Car();

        //근데 이렇게 해도 된다!
        Car hyundai;
        hyundai = null; //이렇게 하면 위에 것과 같은 느낌이 된다.
        //따라서 new Car()는 Garbage 값을 0으로 초기화 해준다고 보면 되는 것이다.
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
    }
}
