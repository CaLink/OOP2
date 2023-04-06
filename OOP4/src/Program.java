public class Program {
    public static void main(String[] args)
    {
        Check("Стас","Stas","Лысый","01.12.13", "Владивсток");
        Check("Ст ас","Stas","Лысый","01.12.13", "Владивсток");
        Check("Стас","Stas","Лысый","33.12.13", "Владивсток");
        Check("Стас","Stas","Лысый","01.12.13", "Av123");



    }

    public static void Check(String Name, String secondName, String thirdName, String date, String place)
    {
        boolean ans = true;

        if(!Name.matches("^[a-zA-Zа-яА-Я]+$")) {
            ans = false;
            //System.out.println("name");
        }
        if(!secondName.matches("^[a-zA-Zа-яА-Я]+$")){
            ans = false;
            //System.out.println("name2");
        }
        if(!thirdName.matches("^[a-zA-Zа-яА-Я]+$")){
            ans = false;
            //System.out.println("name3");
            }
        if(!date.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")){
            ans = false;
            //System.out.println("data");
        }

        if(!place.matches("^[a-zA-Zа-яА-Я]+$")){
            ans = false;
            //System.out.println("city");
            }

        if(!ans)
            System.out.println("Smth Wrong");
        else
            System.out.println("You God damn right");


    }


}
