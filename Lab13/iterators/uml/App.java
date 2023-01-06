package designpattern.iterators.uml;

public class App {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        productCatalog.add("Apple")
                .add("Banana").add("Orange")
                .add("Coconut").add("Grape");
        Iterator it = productCatalog.iterator();
        while (it.hasNext()) {
            String product = (String)it.next();
            System.out.println(product);
        }

    }
}
