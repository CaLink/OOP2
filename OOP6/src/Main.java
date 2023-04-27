public class Main {

    public static void main(String[] args) {

        Monkey flip = new Monkey("Flipper", "BarrelRoll");
        flip.DoSmt();
        Monkey flopper = new Monkey("Flopper", "MONKEY FLIP");
        flopper.DoSmt();

    }
}

class Mediator{
    public static void BeMediated(Monkey ape){
        System.out.println(ape.name + " Do A " + ape.act);
    }
}

class Monkey{

    String name;
    String act;


    public Monkey(String name,String action){
        this.name = name;
        act = action;
    }

    public void DoSmt(){
        Mediator.BeMediated(this);
    }
}