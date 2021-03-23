package UpdateInventory;

public class book {
    private String id;
    private String sub_id;
    private String quantity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSub_id() {
        return sub_id;
    }

    public void setSub_id(String sub_id) {
        this.sub_id = sub_id;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public book(String id, String sub_id, String quantity) {
        this.id = id;
        this.sub_id = sub_id;
        this.quantity = quantity;
    }
}
