import custom.CustClass;

import java.util.LinkedList;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args)
    {
        LinkedList<CustClass> list = new LinkedList<CustClass>();


        list.add(new CustClass(4));
        list.add(new CustClass(42));
        list.add(new CustClass(34));
        list.add(new CustClass(14));
        list.add(new CustClass(4));

        System.out.println(list);

        TreeSet<CustClass> tree = new TreeSet<>();

        tree = AddCustomToTree(10,list);

        System.out.println(tree);

    }

    public static TreeSet<CustClass> AddCustomToTree(int x, LinkedList<CustClass> list)
    {
        TreeSet<CustClass> ans = new TreeSet<>();

        for (CustClass cc:list) {
            if (cc.val > x)
                ans.add(cc);
        }

        return ans;
    }
}
