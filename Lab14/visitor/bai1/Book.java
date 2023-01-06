package designpattern.visitor.bai1;

public abstract class Book {
    protected double price;

    public Book(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public abstract void accept(Visitor visitor);
}
