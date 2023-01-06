package designpattern.adapter;

public class RoundHole {
    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        if(peg.getRadius() <= this.radius) {
            return true;
        }
        return false;
    }
}
