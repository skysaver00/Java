public class Item {
    private String name;
    private int stock;
    private double price;

    public Item(String name, int stock, double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public void modifyName(String name) {
        this.name = name;
    }

    public void addStock(int value) {
        this.stock += value;
    }

    public void modifyStock(int value) {
        this.stock = value;
    }

    public void modifyPrice(double value) {
        this.price = value;
    }
}
