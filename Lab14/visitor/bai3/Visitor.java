package designpattern.visitor.bai3;

public interface Visitor {
    String visitDot(Dot dot);

    //String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
