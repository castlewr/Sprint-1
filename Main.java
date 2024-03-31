public class Main {
    public static void main(String[] args) {
        // Create an instance of InventoryManager
        InventoryManager inventoryManager = new InventoryManager();

        // Create some sample items for a technology store
        Item laptop = new Item("LPT001", "Laptop", 10, 1000, "Manufacturer A");
        Item smartphone = new Item("SPH001", "Smartphone", 20, 800, "Manufacturer B");
        Item monitor = new Item("MON001", "Monitor", 15, 300, "Manufacturer C");
        Item keyboard = new Item("KBD001", "Keyboard", 30, 50, "Manufacturer D");

        // Add items to inventory
        inventoryManager.addItem(laptop);
        inventoryManager.addItem(smartphone);
        inventoryManager.addItem(monitor);
        inventoryManager.addItem(keyboard);

        // Display all items in inventory
        System.out.println("All items in inventory:");
        inventoryManager.listAllItems();
        System.out.println();

        // Search for a specific item
        System.out.println("Searching for item with ID LPT001:");
        inventoryManager.searchItem("LPT001");
        System.out.println();

        // Update an item
        Item updatedLaptop = new Item("LPT001", "Updated Laptop", 12, 1100, "Manufacturer A");
        System.out.println("Updating item with ID LPT001:");
        inventoryManager.updateItem(updatedLaptop);
        System.out.println();

        // Display all items in inventory after update
        System.out.println("All items in inventory after update:");
        inventoryManager.listAllItems();
        System.out.println();

        // Get total inventory value
        System.out.println("Total inventory value: $" + inventoryManager.getTotalInventoryValue());
        System.out.println();

        // Sort items by name
        System.out.println("Sorting items by name:");
        inventoryManager.sortItemsByName().forEach(System.out::println);
        System.out.println();

        // Clear inventory
        System.out.println("Clearing inventory:");
        inventoryManager.clearInventory();
        System.out.println();

        // Display all items in inventory after clearing
        System.out.println("All items in inventory after clearing:");
        inventoryManager.listAllItems();
        System.out.println();
    }
}