public class Main {
    /*
     * Composition VS Inheritance
     * 콤포지션은 클래스 간에 포함관계를 맺는것
     * class point {
     *  int x;
     *  int y;
     * }
     * class circle {
     *  point c = new point();
     *  int r;
     * }
     * 이렇게 point라는 클래스를 포함시켜준다. 따라서 has-a 관계이면, Composition을 가져온다.
     * 반대로 Inheritance는 상속관계다. is-a 관계이면 Inheritance를 쓴다.
     * 이 경우 Circle is a point보다, Circle has a point가 더 알맞으므로, has-a관계, 즉 Composition을 쓰는것이 맞다.
     */

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);


        Monitor monitor = new Monitor("27inch FHD", "Samsung", 27, new Resolution(1920, 1080));
        Motherboard motherboard = new Motherboard("B500", "Asus", "4", "4", "v2.44");

        PC thePC = new PC(theCase, monitor, motherboard);
        thePC.powerUP();
    }
}
