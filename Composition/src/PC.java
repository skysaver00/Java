public class PC {
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor theMonitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.motherboard = motherboard;
    }

    public void powerUP() {
        getTheCase().pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        theMonitor.drawPixelAt(1200, 50, "Yellow");
    }

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getTheMonitor() {
        return theMonitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }
}
