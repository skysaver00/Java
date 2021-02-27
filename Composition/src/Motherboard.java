public class Motherboard {
    private String model;
    private String manufacturer;
    private String ramSlots;
    private String cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, String ramSlots, String cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programNmae) {
        System.out.println("Program " + programNmae + "is now loading......");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(String ramSlots) {
        this.ramSlots = ramSlots;
    }

    public String getCardSlots() {
        return cardSlots;
    }

    public void setCardSlots(String cardSlots) {
        this.cardSlots = cardSlots;
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }
}
