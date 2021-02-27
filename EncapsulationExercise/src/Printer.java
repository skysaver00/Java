public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount <= 100) {
            if(this.tonerLevel + tonerAmount > 100) return -1;
            else {
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }
        } else return -1;
    }

    public int printPages(int pagesToPrint) {
        int page = pagesToPrint;
        if(this.duplex == true) {
            System.out.println("Printing in duplex mode");
            page = pagesToPrint / 2 + pagesToPrint % 2;
            this.pagesPrinted += page;
            return page;
        } else {
            this.pagesPrinted += page;
            return page;
        }
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }
}
