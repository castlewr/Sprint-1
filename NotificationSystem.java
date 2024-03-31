import java.util.Map;

public class NotificationSystem {

    public void checkInventoryLevels(Map<String, Item> inventory, int minThreshold) {
        for (Item item : inventory.values()) {
            if(item.getQuantity() < minThreshold) {
                sendNotification("Low inventory level for item: " + item.getName());
            }
        }
    }

    private void sendNotification(String message) {
        System.out.println("Notification send: " + message);
    }
}
