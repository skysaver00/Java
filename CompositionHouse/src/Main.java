public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("XDT_MNAVIDL80LD", "Apple", new Size(15, 25), 20);
        Television television = new Television("QLED_65QHD", "Samsung", new Size(140, 90), 65);
        Sofa sofa = new Sofa("Leather", "Illom", new Size(2000, 3000), 700);

        Room room = new Room(computer, television, sofa);
        room.explain();
    }
}
