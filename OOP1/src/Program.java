import geo.*;

public class Program {
    public  static void main(String[] args){

        Box box = new Box(50);

        Ball ball = new Ball(3);
        Ball ballL = new Ball(1);
        Cylinder kak = new Cylinder(50, 0.5);
        Pyramid pyr = new Pyramid(10,2);

        System.out.println(box.add(ball));
        System.out.println(box.add(ballL));
        System.out.println(box.add(kak));
        System.out.println(box.add(pyr));
        System.out.println(box.add(kak));

        System.out.println(box.getVolume());
        System.out.println(box.curVal);

        for (Shape i : box.arr) {
            System.out.println(i.toString());
        }



    }
}
