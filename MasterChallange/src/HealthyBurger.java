public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, String meat, double price, String breadRollType, String healthyExtra1Name) {
        super("Healthy", meat, price, breadRollType);
    }

    public void addHealthyAddition1(String name, double price) {
        healthyExtra1Name = name;
        healthyExtra1Price = price;

        System.out.println("Added " + name + "for an extra " + price);
    }

    public void addHealthyAddition2(String name, double price) {
        healthyExtra2Name = name;
        healthyExtra2Price = price;

        System.out.println("Added " + name + "for an extra " + price);
    }

    @Override
    public double itemizehamburger() {
        return super.itemizehamburger();
    }
}
