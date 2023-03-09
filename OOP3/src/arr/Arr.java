package arr;

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

    public void Add(T data)
    {
        if (list.size() >= width)
            return;
        list.add(data);
    }

    public void Del()
    {
        if (list.size()>0)
            list.remove(list.size()-1);
    }

    public int LessThan(T data)
    {
        int count = 0;

        for (T i : list) {
            if (i.compareTo(data) == -1)
                count++;
        }
        return  count;
    }

    public boolean Duplicate(){

        for (T i : list) {
            int count = 0;
            for (T j : list) {
                if(i.compareTo(j) == 0)
                    count++;
            }
            if (count>1) {

                return true;
            }
        }


        return false;
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
