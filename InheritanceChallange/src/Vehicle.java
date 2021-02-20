public class Vehicle {
    private int speed;
    private int steering;
    private int gear;
    private String name;
    private String size;

    public Vehicle(int speed, int steering, int gear, String name, String size) {
        this.speed = 0;
        this.steering = 0;
        this.gear = gear;
        this.name = name;
        this.size = size;
    }

    public void handSteering(int steering) {
        this.steering += steering;
        System.out.println("Vehicle.steer(): steering at " + steering + " degrees.");
    }

    public void move(int speed, int steering) {
        this.steering = steering;
        this.speed = speed;
        System.out.println("Vechicle.move(): moving at " + steering + " in direction, " + speed + "km/h.");
    }

    public void changeGear(int gear) {
        this.gear = gear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
