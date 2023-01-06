public class Book2 {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book2() {
        this.name = "";
        this.authors = new Author[99];
        this.price = 0.0;
        this.qty = 0;
    }

    public Book2(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public Book2(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return authors;
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

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthorName() {
        StringBuilder description = new StringBuilder();
        for (int i=0; i<authors.length; i++) {
            description.append(authors[i].getName()).append(",");
        }
        return description.toString();
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Book").append("[")
                .append("name= ").append(this.name).append(", ");
        for (int i = 0; i<this.authors.length; i++) {
            description.append(this.authors[i]).append(", ");
        }
        description.append(" price= ").append(this.price).append(", ")
                .append(" qty= ").append(this.qty)
                .append("]");
        return description.toString();
    }
}
