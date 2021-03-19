import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    } //ToString 을 alt + insert해서 입력하면 된다.

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, ""+this.hitPoints);
        values.add(2, ""+this.strength);
        values.add(3, this.weapon);

        return null;
    }

    @Override
    public void read(List<String> savedVal) {
        if(savedVal != null && savedVal.size() > 0) {
            this.name = savedVal.get(0);
            this.hitPoints = Integer.parseInt(savedVal.get(1));
            this.strength = Integer.parseInt(savedVal.get(2));
            this.weapon = savedVal.get(3);

            //이런식으로 Monster도 해결하면 된다.
        }
    }
}
