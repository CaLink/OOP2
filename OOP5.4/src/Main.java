import java.util.ArrayList;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String[] args) {

        ArrayList<String> file = new ArrayList<String>();
        file.add("АбОбУс");
        file.add("самаядлиннаястрочка");
        file.add("Аииэээааиээаааооо");

        Find big = (arr)->{

            long max = 0;
            String ans = "";
            Pattern pat = Pattern.compile("[А-ЯЁA-Z]");
            for(String i: arr)
            {
                if(pat.matcher(i).results().count() > max) {
                    max = pat.matcher(i).results().count();
                    ans = i;
                }
            }
            return ans;
        };
        Find lon = (arr)->{

            long max = 0;
            String ans = "";
            Pattern pat = Pattern.compile("[А-ЯЁA-Z]");
            for(String i: arr)
            {
                if(i.length()>max){
                    max = i.length();
                    ans = i;
                }
            }
            return ans;
        };
        Find vovel  = (arr)->{

            long max = 0;
            String ans = "";
            Pattern pat = Pattern.compile("[ауоыэяюёиеАУОЫЭЯЮЁИЕaeiouAEIOU]");
            for(String i: arr)
            {
                if(pat.matcher(i).results().count() > max) {
                    max = pat.matcher(i).results().count();
                    ans = i;
                }
            }
            return ans;
        };


        System.out.println(Finder(big,file));
        System.out.println(Finder(lon,file));
        System.out.println(Finder(vovel,file));

    }

    static String Finder(Find lam,ArrayList<String> arr){
        return lam.find(arr);
    }

}

interface Find {
    String find(ArrayList<String> arr);
}
