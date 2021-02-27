public class Sofa {
    private String material;
    private String manufacturer;
    private Size size;
    private int depth;

    public Sofa(String material, String manufacturer, Size size, int depth) {
        this.material = material;
        this.manufacturer = manufacturer;
        this.size = size;
        this.depth = depth;
    }

    public void sofaInfo() {
        System.out.println("This sofa is made of " + this.material + ", and" +
                "made by " + this.manufacturer + ". size is " + this.size.getWidth() + " x " +
                this.size.getHeigth() + " x " + this.depth);
    }

    public String getMaterial() {
        return material;
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
