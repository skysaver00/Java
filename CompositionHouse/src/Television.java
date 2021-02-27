public class Television {
    private String model;
    private String manufacturer;
    private Size size;
    private int inch;

    public Television(String model, String manufacturer, Size size, int inch) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.inch = inch;
    }

    public void tvInfo() {
        System.out.println("This Television is " + this.inch + "s long,"
        + " and made by " + this.manufacturer + ".");
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

    public int getInch() {
        return inch;
    }
}
