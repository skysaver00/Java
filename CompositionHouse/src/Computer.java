public class Computer {
    private String model;
    private String manufacturer;
    private Size size;
    private int depth;

    public Computer(String model, String manufacturer, Size size, int depth) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.depth = depth;
    }

    public void computerInfo() {
        System.out.println("Model is " + this.model + " and Manufacturer is " +
        this.manufacturer + ". Size is " + this.size.getWidth() + " x "
        + this.size.getHeigth() + " x " + this.depth + ".");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Size getSize() {
        return size;
    }

    public int getDepth() {
        return depth;
    }
}
