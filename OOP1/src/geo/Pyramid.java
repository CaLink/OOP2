package geo;

public class Pyramid extends Shape{

    private double s;
    private double h;

    public Pyramid(double s, double h)
    {
        this.s = s;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return 0.3*h*s;
    }

    @Override
    public String toString() {
        return "Pyramid{" +
                "s=" + s +
                ", h=" + h +
                ", volume=" + getVolume() +
                '}';
    }
}
