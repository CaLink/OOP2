import jdk.jshell.execution.LoaderDelegate;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	People ass = new People("Stas","01.04.988");
    ass.Save();
    People sas = People.Load();


    ArrayList<People> list = new ArrayList<>();
    list.add(new People("Stas","Sas"));
    list.add(new People("Pas","Sas"));
    list.add(new People("Fast","Sas"));

    People.SaveArr(list);
    ArrayList<People> ll = People.LoarArr();
    }
}

class People implements Serializable{
    String name;
    String birth;

    People(String x,String y)
    {
        name = x;
        birth = y;
    }

    void Save()
    {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.txt"));
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void SaveArr(ArrayList<People> arr)
    {
        try(FileWriter writer = new FileWriter("piplZ.csv")){
            String ans = "";
            ans += "People,Brith\n";
            for (People plz: arr) {
                ans += plz.name + "," + plz.birth + "\n";
            }
            writer.write(ans);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static People Load()
    {
        People ans = new People("","");

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.txt")))
        {
            ans=(People)ois.readObject();

        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

        return ans;
    }

    static ArrayList<People> LoarArr()
    {
        ArrayList<People> ans = new ArrayList<>();

        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("piplZ.csv"));
            reader.readLine();
            String line = reader.readLine();

            while (line != null)
            {
                People temp = new People(line.split(",")[0],line.split(",")[1]);
                ans.add(temp);
                line = reader.readLine();
            }

        }
        catch (IOException e)
        {

        }

        return ans;
    }

}