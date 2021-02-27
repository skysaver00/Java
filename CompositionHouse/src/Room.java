public class Room {
    private Computer theComputer;
    private Television theTelevision;
    private Sofa theSofa;

    public Room(Computer theComputer, Television theTelevision, Sofa theSofa) {
        this.theComputer = theComputer;
        this.theTelevision = theTelevision;
        this.theSofa = theSofa;
    }

    public void explain() {
        getTheComputer().computerInfo();
        getTheTelevision().tvInfo();
        getTheSofa().sofaInfo();
    }

    private Computer getTheComputer() {
        return theComputer;
    }

    private Television getTheTelevision() {
        return theTelevision;
    }

    private Sofa getTheSofa() {
        return theSofa;
    }
}
