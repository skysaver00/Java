public class Main {
    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
        //이렇게 선언하는 이유는 mcLaren이라는 외부 클래스에서 자바의 일관성을 지키기 위함이다.
        //그래서 OuterClass.new InnerClass() 이렇게 선언해준다.
        //이거 안된다. Gearbox.Gear second = new Gearbox.Gear(2, 15.4);

        System.out.println(first.driveSpeed(1000));
    }
}
