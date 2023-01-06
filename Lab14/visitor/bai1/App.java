package designpattern.visitor.bai1;

public class App {
    public static void main(String[] args) {
        ConcreteVisitor visitor = new ConcreteVisitor();

        Book businessBook1 = new BusinessBook(50, "DHQG");
        businessBook1.accept(visitor);
        System.out.println();

        Book designPatternBook1 = new DesignPatternBook(70, "Store", "Headfirst");
        designPatternBook1.accept(visitor);
        System.out.println();

        Book javaCoreBook1 = new JavaCoreBook(60, "Store", "Google");
        javaCoreBook1.accept(visitor);
        System.out.println();

        System.out.println("Price of all books: " + visitor.getTotalPrice());
    }
}
