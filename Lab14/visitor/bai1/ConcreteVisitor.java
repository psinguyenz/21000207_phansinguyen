package designpattern.visitor.bai1;

public class ConcreteVisitor implements Visitor{
    private double totalPrice;

    @Override
    public void visit(BusinessBook book) {
        this.totalPrice += book.getPrice();
        System.out.println(book.getPublisher());
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public void visit(JavaCoreBook book) {
        this.totalPrice += book.getPrice();
        System.out.println(book.getFavouriteBook());
        System.out.println(book.getResource());
    }

    @Override
    public void visit(DesignPatternBook book) {
        this.totalPrice += book.getPrice();
        System.out.println(book.getBestSellar());
        System.out.println(book.getResource());
    }
}
