package designpattern.adapter;

public class TestAdapter {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println(hole.fits(roundPeg) + "");

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);
        RoundPeg adapter = new SquarePegAdapter(smallSquarePeg);
        RoundPeg adapter2 = new SquarePegAdapter(largeSquarePeg);
        System.out.println(hole.fits(adapter));
        System.out.println(hole.fits(adapter2));
    }
}
