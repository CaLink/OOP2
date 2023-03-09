import arr.*;
public class Program {
    public static void main(String[] args)
    {
        arr.Arr<String> sas = new Arr<String>(10);
        sas.Add("QWE");
        sas.Add("Qwa");
        sas.Add("QWo");
        sas.Add("QWE");
        sas.Add("QWE");
        sas.Add("QWE");
        sas.Add("QWE");
        sas.Add("QWE");
        sas.Add("QWE");
        sas.Add("QWE");
        sas.Add("QWE");
        sas.Add("QWE");
        sas.Add("QWE");
        sas.Add("QWE");
        sas.Add("vassal");


        System.out.println(sas);
        sas.Del();
        System.out.println(sas);

        System.out.println(sas.LessThan("QWER"));
        System.out.println(sas.Duplicate());

        arr.Arr<Cus> asa = new Arr<Cus>(4);
        asa.Add(new Cus(10));
        asa.Add(new Cus(5));
        asa.Add(new Cus(10));
        asa.Add(new Cus(10));
        asa.Add(new Cus(10));


        System.out.println(asa);
        asa.Del();
        System.out.println(asa);

        System.out.println(asa.LessThan(new Cus(7)));
        System.out.println(asa.Duplicate());




    }
}
