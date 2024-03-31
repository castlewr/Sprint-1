import java.util.*;

public class InventoryManager {

    private Map<String, Item> inventory;
    private List<Transaction> transactionHistory;

    public InventoryManager() {
        this.inventory = new HashMap<>();
        this.transactionHistory = new ArrayList<>();
    }

    private void addToTransactionHistory(OperationType operationType, Item item) {
        Transaction transaction = new Transaction(new Date(), operationType , item);
        transactionHistory.add(transaction);
    }

    public void addItem(Item item) {
        if (inventory.containsKey(item.getItemID())) {
            System.out.println("Item with ID " + item.getItemID() + " already exists in inventory.");
        } else {
            inventory.put(item.getItemID(), item);
            addToTransactionHistory(OperationType.ADD, item);
        }
    }

    public void removeItem(Item item) {
        if (inventory.containsKey(item.getItemID())) {
            inventory.remove(item);
            addToTransactionHistory(OperationType.REMOVE, item);
        } else {
            System.out.println("Item with ID " + item.getItemID() + " does not exist in inventory.");
        }
    }

    public void updateItem(Item updatedItem) {
        String itemId = updatedItem.getItemID();
        if (inventory.containsKey(itemId)) {
            inventory.put(itemId, updatedItem);
            addToTransactionHistory(OperationType.UPDATE, updatedItem);
            System.out.println("Item with ID " + itemId + " has been updated.");
        } else {
            System.out.println("Item with ID " + itemId + " does not exist in inventory.");
        }
    }

    public void searchItem(String itemId) {
        if (inventory.containsKey(itemId)) {
            Item item = inventory.get(itemId);
            System.out.println("Item found: " + item);
        } else {
            System.out.println("Item with ID " + itemId + " not found in inventory.");
        }
    }

    public void listAllItems() {
        System.out.println("Inventory Items:");
        for (Item item : inventory.values()) {
            System.out.println(item);
        }
    }

    public int getInventorySize() {
        return inventory.size();
    }

    public int getItemAvailability(String itemId) {
        if (inventory.containsKey(itemId)) {
            return inventory.get(itemId).getQuantity();
        } else {
            return 0; // Item not found
        }
    }

    // Calculate Total Inventory Value
    public int getTotalInventoryValue() {
        int totalValue = 0;
        for (Item item : inventory.values()) {
            totalValue += item.getQuantity() * item.getPrice();
        }
        return totalValue;
    }

    // Sort Items by Name
    public List<Item> sortItemsByName() {
        List<Item> sortedItems = new ArrayList<>(inventory.values());
        Collections.sort(sortedItems, Comparator.comparing(Item::getName));
        return sortedItems;
    }

    // Sort Items by Quantity
    public List<Item> sortItemsByQuantity() {
        List<Item> sortedItems = new ArrayList<>(inventory.values());
        Collections.sort(sortedItems, Comparator.comparingInt(Item::getQuantity));
        return sortedItems;

    }

    // Sort Items by Price
    public List<Item> sortItemsByPrice() {
        List<Item> sortedItems = new ArrayList<>(inventory.values());
        Collections.sort(sortedItems, Comparator.comparingInt(Item::getPrice));
        return sortedItems;
    }

    // Clear Inventory
    public void clearInventory() {
        inventory.clear();
        System.out.println("Inventory cleared successfully.");
    }

    // Generate Inventory Report
    public void generateInventoryReport() {
        System.out.println("Inventory Report:");
        System.out.println("Total Items: " + inventory.size());
        System.out.println("Total Inventory Value: " + getTotalInventoryValue());
        // Add more details to the report as needed
    }

    // Set Item Quantity
    public void setItemQuantity(String itemId, int quantity) {
        if (inventory.containsKey(itemId)) {
            Item item = inventory.get(itemId);
            item.setQuantity(quantity);
            addToTransactionHistory(OperationType.UPDATE, item);
            System.out.println("Quantity of item with ID " + itemId + " set to " + quantity);
        } else {
            System.out.println("Item with ID " + itemId + " does not exist in inventory.");
        }
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(List<Transaction> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }
}
