public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem() {
        this.id = "";
        this.desc = "";
        this.qty = 1;
        this.unitPrice = 1.0;
    }

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String getDesc() {
        return desc;
    }

    public String getId() {
        return id;
    }

    public int getQty() {
        return qty;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return this.unitPrice * this.qty;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("InvoiceItem").append("[")
                .append("id= ").append(this.id)
                .append(" decs= ").append(this.desc)
                .append(" qty= ").append(this.qty)
                .append(" unitPrice= ").append(this.unitPrice)
                .append("]");
        return description.toString();
    }
}
