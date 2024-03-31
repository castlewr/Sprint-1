import java.util.HashMap;
import java.util.Map;

public class InventoryList {

    Map<String, Item> List = new HashMap<String, Item>();

    public static void main(String[] args) {

    }

    public class Item {
        private String itemID = "";
        private int quantity = 0;
        private int price = 0;
        private String origin = "";

        public Item(String itemID, int quantity, int price, String origin) {
            this.itemID = itemID;
            this.quantity = quantity;
            this.price = price;
            this.origin = origin;
        }

        public String getItemID() {
            return itemID;
        }

        public void setItemID(String itemID) {
            this.itemID = itemID;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

    }

    public void addItem(Item item) {
        if (!List.containsKey(item.itemID)) {
            List.put(item.itemID, item);
            return;
        }
        item.quantity += 1;
        return;
    }

    public void removeItem(Item item) {
        if (!List.containsKey(item.itemID) || item.quantity == 0) {
            System.out.println("There is no item to remove from this list");
            return;
        }

        item.quantity -= 1;
        return;
    }
}
