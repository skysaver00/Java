public class Dog extends Animal{//인터페이스는 implements를 쓴 반면, abstract는 상속과 같이 extends를 쓴다.

    public Dog(String name) {
        super(name);
    } //이렇게 super가 만들어진다.

    //이렇게 오버라이드 가능
    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breath() {
        System.out.println("Breath in, breath out, repeat");
    }

    //이렇게 기존에 있는 animal의 메소드를 새로 고치려면 override로 해준다.
}
