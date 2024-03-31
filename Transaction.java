import java.util.Date;
public class Transaction {
    private Date timestamp;
    private OperationType operation;
    private Item item;

    public Transaction(Date timestamp, OperationType operation, Item item) {
        this.timestamp = timestamp;
        this.operation = operation;
        this.item = item;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public OperationType getOperation() {
        return operation;
    }

    public void setOperation(OperationType operation) {
        this.operation = operation;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}

