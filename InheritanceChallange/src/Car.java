public class Car extends Vehicle {
    private int wheels;
    private int door;
    private boolean isManual;
    private int currentgear;

    public Car(int speed, int steering, int gear, String name, String size, int wheels, int door, boolean isManual, int currentgear) {
        super(speed, steering, gear, name, size);
        this.wheels = wheels;
        this.door = door;
        this.isManual = isManual;
        this.currentgear = currentgear;
    }


}
