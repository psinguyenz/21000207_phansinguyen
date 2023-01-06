public class Customer {
    private int id;
    private String name;
    private int discount;

    public Customer() {
        this.id = 0;
        this.name = "";
        this.discount = 0;
    }

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getDiscount() {
        return discount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("\"").append(this.name).append("(")
                .append(this.id).append(")(")
                .append(this.discount).append("%)").append("\"");
        return description.toString();
    }
}
