package designpattern.iterators.uml;

public class ProductCatalog implements Iterable{
    private String[] productCatalog;
    private final int SIZE = 100;
    private int length;

    public ProductCatalog() {
        this.length = 0;
        productCatalog = new String[this.SIZE];
    }

    @Override
    public Iterator iterator() {
        return new ProductIterator(productCatalog, length);
    }

    public ProductCatalog add(String product) {
        if(length >= this.productCatalog.length - 1) {
            return this;
        }
        this.productCatalog[this.length + 1] = product;
        this.length++;
        return this;
    }
}
