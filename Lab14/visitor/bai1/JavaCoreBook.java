package designpattern.visitor.bai1;

public class JavaCoreBook extends ProgammingBook{
    private String resource;
    private String favouriteBook;

    public JavaCoreBook(double price, String resource, String favouriteBook) {
        super(price);
        this.favouriteBook = favouriteBook;
        this.resource = resource;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void setFavouriteBook(String favouriteBook) {
        this.favouriteBook = favouriteBook;
    }

    public String getFavouriteBook() {
        return favouriteBook;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    @Override
    public String getResource() {
        return resource;
    }
}
