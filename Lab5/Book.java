public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book() {
        this.name = "";
        this.author = new Author();
        this.price = 0.0;
        this.qty = 0;
    }

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Book").append("[")
                .append("name= ").append(this.name).append(", ")
                .append(this.author.toString()).append(", ")
                .append(" price= ").append(this.price).append(", ")
                .append(" qty= ").append(this.qty)
                .append("]");
        return description.toString();
    }
}
