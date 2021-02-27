public class Main {
    public static void main(String[] args) {
        /*
        Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remamining Health = " +player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remamining Health = " +player.healthRemaining());*/
        //너무 쓰레기 코드. Encapsulation이 안되어있다.

        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());

    }
}
