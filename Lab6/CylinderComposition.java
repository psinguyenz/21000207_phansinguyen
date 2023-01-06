public class CylinderComposition {
    private CircleComposition base;
    private double height;

    public CylinderComposition() {
        base = new CircleComposition();
        height = 1.0;
    }

    public CylinderComposition(CircleComposition base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public CircleComposition getBase() {
        return base;
    }

    public void setBase(CircleComposition base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.height * this.base.getArea();
    }

    public double getArea() {
        return 2 * this.base.getArea() + 2 * this.base.getCircumference() * this.height;
    }

    @Override
    public String toString() {
        return "CylinderComposition[" +
                "base=" + base +
                ", height=" + height +
                ']';
    }
}
