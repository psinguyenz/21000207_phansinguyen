public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice() {
        this.id = 0;
        this.customer = new Customer();
        this.amount = 0.0;
    }

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getCustomerID() {
        return this.customer.getId();
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public int getCustomerDiscount() {
        return this.customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        int discount = getCustomerDiscount();
        return amount * (100-discount) / 100;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Invoice").append("[")
                .append("id= ").append(this.id).append(", ")
                .append(" customer= ").append(this.customer).append(", ")
                .append(" amount= ").append(this.amount)
                .append("]");
        return description.toString();
    }
}
