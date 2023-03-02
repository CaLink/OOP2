package geo;

import java.util.ArrayList;

public class Box extends Shape{

    private double volume;
    public double curVal;
    public ArrayList<Shape> arr;

    public Box(double vol)
    {
        volume = vol;
        curVal = 0;
        arr = new ArrayList<>();

    }

    @Override
    public double getVolume() {
        return volume;
    }

    public boolean add(Shape fig)
    {
        if(volume > (curVal+fig.getVolume()))
        {
            curVal += fig.getVolume();
            arr.add(fig);
        }
        else
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Box{" +
                "volume=" + volume +
                ", curVal=" + curVal +
                '}';
    }
}
