import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0); //Inner Classes
        this.gears.add(neutral);
    }



    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if((number > 0) && (number <= maxGears)) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if((newGear >= 0) && (newGear < this.gears.size()) && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if(clutchIsIn) {
            System.out.println("Scream!!!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    private class Gear { //이걸 private로 바꾸면 접근을 하지 못한다.
    // 따라서 여기에 접근하려면 다른 메소드가 필요하다.
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {

            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return revs * this.ratio;
        }
    }

    // 따라서 말 그대로 클래스 내에서 선언된 클래스를 뜻한다.
    // 이렇게 하면 두 클래스간의 멤버들 간 쉽게 접근 가능
    // 불필요한 클래스는 감춰서 복잡성을 줄인다. -> 캡슐화
    // Static, non Static 모두 가능
    // 외부에서 해당 클래스의 내부클래스를 보면 멤버, Object같아보이기 때문에,
    // 겉 클래스를 new로 생성하고, 내부도 new로 다시 생성해준다.

}
