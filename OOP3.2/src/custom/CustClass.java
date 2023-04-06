package custom;

public class CustClass implements Comparable<CustClass> {

    public int val;

    public CustClass(int x)
    {
        val = x;
    }


    @Override
    public int compareTo(CustClass o) {

        if(val==o.val)
            return 0;
        else if(val>o.val)
            return 1;
        else
            return -1;

    }

    @Override
    public String toString() {
        return "val=" + val;
    }
}
