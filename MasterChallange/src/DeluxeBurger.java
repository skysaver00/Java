public class DeluxeBurger extends Hamburger{
    public DeluxeBurger(String name, String meat, double price, String breadRollType) {
        super("Deluxe", meat, 14.54, breadRollType);
        super.addHamburgerAddition1("Chips", 2.76);
        super.addHamburgerAddition2("Drink", 1.80);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }


}