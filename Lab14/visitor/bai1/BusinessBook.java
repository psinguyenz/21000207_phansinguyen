package designpattern.visitor.bai1;

public class BusinessBook extends Book{
    private String publisher;

    public BusinessBook(double price, String publisher) {
        super(price);
        this.publisher = publisher;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return this.publisher;
    }
}
