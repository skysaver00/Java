public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //추상 메소드는 추상 클래스 내에 있어야 한다.
    public abstract void eat();
    public abstract void breath();

    public String getName() {
        return name;
    }


}
