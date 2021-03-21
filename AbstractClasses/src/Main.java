public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Doggy");
        dog.eat();
        dog.breath();

        Parrot parrot = new Parrot("금강앵무");
        parrot.eat();
        parrot.breath(); //기존 상속과 같이 나온다.
        parrot.fly();

        Penguin penguin = new Penguin("아델리 펭귄");
        penguin.eat();
        penguin.breath();
        penguin.fly();
    }
}
