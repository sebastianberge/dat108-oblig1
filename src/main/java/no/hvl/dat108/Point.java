package no.hvl.dat108;

public class Point {
    private final Double x;
    private final Double y;

    /**
     * Constructs a new point.
     */
    public Point() {
        x = 0.;
        y = 0.;
    }

    /**
     * Constructs a new point.
     * 
     * @param x
     * @param y
     */
    public Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x
     */
    public Double getX() {
        return x;
    }

    /**
     * @return the y
     */
    public Double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
