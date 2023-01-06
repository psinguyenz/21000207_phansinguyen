package designpattern.adapter;

public class SquarePegAdapter extends RoundPeg{
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        super(squarePeg.getWidth());
        this.peg = squarePeg;
    }

    @Override
    public int getRadius() {
        return (int)(peg.getWidth() * (Math.sqrt(2)/2));
    }
}
