public class Dog extends Animal {
    //이렇게 extend한다. 이러면 inherit된거.
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    //이건 unique한 dog의 variable이다. variable이라 하기보다는 traits 특성.

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); //모든 Dog는 뇌랑, 몸이 있다.
        //이렇게 지정해 줄 수 있다.
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    } //이렇게 generate를 통해 constructor를 더해주면 된다.

    public void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
        move(10);
    }

    public void run() {
        System.out.println("Dog.run() called");

    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
