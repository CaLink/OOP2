package geo;

public class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double h,double r)
    {
        height = h;
        radius = r;
    }

    @Override
    public double getVolume() {
        return  Math.PI * radius * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", volume=" + getVolume() +
                '}';
    }
}
