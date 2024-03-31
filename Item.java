public class Item {
    private String itemID = "";
    private String name = "";
    private String upc = "";
    private int quantity = 0;
    private String origin = "";
    private int price = 0;
    private String description = "";
    private String category = "";
    private String manufacturer = "";



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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int calcTotalValue() {
        return quantity * price;
    }

    public boolean isAvailable() {
        return quantity > 0;
    }

    public boolean isValid() {
        return !name.isEmpty() && !origin.isEmpty();
    }
}
