import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Item> itemList;

    public Branch(String name) {
        this.name = name;
        this.itemList = new ArrayList<Item>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public boolean addItem(String name, int stock, double price) {
        if(findItem(name) == null) {
            this.itemList.add(new Item(name, stock, price));
            return true;
        } else return false;
    }

    public boolean changeItemName(String preName, String chName) {
        Item item = findItem(preName);
        if(item.getName() == preName) {
            item.modifyName(chName);
            return true;
        } else return false;
    }

    public int changeStock(String name, int newStock, int check) {
        if(check != 1 || check != 2) return - 1;
        Item item = findItem(name);
        if(item == null) return -1;
        if(check == 1) {
            item.addStock(newStock);
            return item.getStock();
        } else {
            item.modifyStock(newStock);
            return item.getStock();
        }
    }

    public boolean changePrice(String name, double newPrice) {
        Item item = findItem(name);
        if(item == null) return false;
        item.modifyPrice(newPrice);
        return true;
    }

    private Item findItem(String name) {
        for(int i = 0; i < itemList.size(); i++) {
            Item item = itemList.get(i);
            if(item.getName() == name) return item;
        } return null;
    }
}
