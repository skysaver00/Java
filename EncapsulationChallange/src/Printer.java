public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        if(tonerLevel <= 100 && tonerLevel >= 0) this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public void printPage(int pages) {
        for(int i = 1; i <= pages; i++) {
            System.out.println("Page " + i + " is printed.");
        }
        this.pagesPrinted += pages;
    }

    public void ifduplex() {
        if(this.duplex == false) System.out.println("Its not duplex.");
        else System.out.println("Its a duplex.");
    }
}
