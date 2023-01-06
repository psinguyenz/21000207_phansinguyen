package designpattern.visitor.bai1;

public class DesignPatternBook extends ProgammingBook{
    private String resource;
    private String bestSellar;

    public DesignPatternBook(double price, String resource, String bestSellar) {
        super(price);
        this.resource = resource;
        this.bestSellar = bestSellar;
    }

    public String getBestSellar() {
        return bestSellar;
    }

    public void setBestSellar(String bestSellar) {
        this.bestSellar = bestSellar;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    @Override
    public String getResource() {
        return this.resource;
    }
}
