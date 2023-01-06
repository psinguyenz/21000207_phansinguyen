package designpattern.visitor.bai1;

public abstract class ProgammingBook extends Book{
    public abstract String getResource();

    public ProgammingBook(double price) {
        super(price);
    }
}
