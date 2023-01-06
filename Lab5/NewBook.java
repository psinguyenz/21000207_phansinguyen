public class NewBook {
    private String isbn;
    private String name;
    private NewAuthor author;
    private double price;
    private int qty;

    public NewBook() {
        this.isbn = "";
        this.name = "";
        this.author = new NewAuthor();
        this.price = 0.0;
        this.qty = 0;
    }

    public NewBook(String isbn, String name, NewAuthor author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public NewBook(String isbn, String name, NewAuthor author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public NewAuthor getAuthor() {
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

    public void setAuthor(NewAuthor author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthorName(){
        String authorname = this.author.getName();
        return authorname;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Book").append("[")
                .append("isbn= ").append(this.isbn).append(", ")
                .append("name= ").append(this.name).append(", ")
                .append(this.author.toString()).append(", ")
                .append(" price= ").append(this.price).append(", ")
                .append(" qty= ").append(this.qty)
                .append("]");
        return description.toString();
    }
}
