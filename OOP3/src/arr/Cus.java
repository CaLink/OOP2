package arr;

public class Cus implements Comparable {

    private int asq;

    public Cus(int init){
        asq = init;
    }


    @Override
    public int compareTo(Object o) {
        return Integer.compare(asq, ((Cus) o).asq);
    }

    @Override
    public String toString() {
        return "Cus{" +
                "asq=" + asq +
                '}';
    }
}
