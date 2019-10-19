package exercise32;

public class Point {
    private int y;
    private int x;

    public Point(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public Point() {
        this(0, 0);
    }

    public double distance(Point p) {
        return distance(p.getX(), p.getY());
    }

    public double distance(int x, int y) {
        //D=√(x2−x1)^2+(y2−y1)^2
        int xFactor = x - this.getX();
        int yFactor = y - this.getY();
        double distance = Math.sqrt(xFactor * xFactor + yFactor * yFactor);
        return distance;
    }

    public double distance() {
        return distance(0, 0);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}