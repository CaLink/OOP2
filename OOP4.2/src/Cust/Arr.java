package Cust;
import java.lang.module.FindException;
import java.util.*;

public class Arr <T extends Comparable> {
    private int width =0;
    public int getWidth() {
        return width;
    }

    List<T> list;

    public Arr(int w)
    {
        width = w;
        list = new ArrayList<T>();
    }

    public void Add(T data) throws FullEx
    {
        if (list.size() >= width)
            throw new FullEx();
        list.add(data);

    }

    public void Del() throws EmptyEx
    {

        if (list.size() > 0)
            list.remove(list.size() - 1);
        else
            throw new EmptyEx();

    }

    public int Find(T obj) throws EmptyEx{
        int ans=-1;

            if (list.size() <= 0)
                throw new EmptyEx();

        for (int i =0; i<width;i++)
        {
            if(list.get(i) == obj)
                ans = i;
        }
        return ans;
    }


    public String toString() {
        String result = "";
        for (int i = 0; i < list.size(); i++)
        {
            result = result + list.get(i) + ", ";

        }
        return result;
    }

}

class FullEx extends Exception{
    public FullEx()
    {
        super("Array is Full");
    }
}
class EmptyEx extends Exception{
    public EmptyEx()
    {
        super("Array is Empty");
    }
}