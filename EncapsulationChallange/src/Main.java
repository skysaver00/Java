public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(75, 240, false);

        printer.printPage(26);
        printer.ifduplex();
    }
}
