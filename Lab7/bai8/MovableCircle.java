package bai8;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    @Override
    public String toString() {
        return "MoveableCircle[" +
                "radius=" + radius +
                ", center=" + center +
                ']';
    }

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}

