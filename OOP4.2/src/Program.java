import Cust.Arr;

public class Program {
    public static void main(String[] args)
    {
        Arr<String> list =  new Arr<String>(10);
        try {
            list.Find("qwas");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

        try {
            list.Del();
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

        try {
            list.Add("qwe");list.Add("qwe");list.Add("qwe");
            list.Add("qwe");list.Add("qwe");list.Add("qwe");
            list.Add("qwe");list.Add("qwe");list.Add("qwe");
            list.Add("qwe");list.Add("qwe");list.Add("qwe");

        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

}
