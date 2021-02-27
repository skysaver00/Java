public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);


        Monitor monitor = new Monitor("27inch FHD", "Samsung", 27, new Resolution(1920, 1080));
        Motherboard motherboard = new Motherboard("B500", "Asus", "4", "4", "v2.44");

        PC thePC = new PC(theCase, monitor, motherboard);
        thePC.getTheMonitor().drawPixelAt(1500, 1000, "red");
        thePC.getMotherboard().loadProgram("Windows 10");
    }
}
