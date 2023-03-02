package geo;

public class Ball extends SolidOfRevolution{

    public Ball(double r){
        radius = r;
    }

    @Override
    public double getVolume(){
        return 4* Math.PI*Math.pow(getRadius(),2);
    }

    @Override
    public String toString() {
        return "Ball{" + "radius=" + radius + ", volume=" + getVolume() +"}";
    }
}
