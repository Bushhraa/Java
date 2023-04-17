import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Car obj=new Car();
        Boat obj2 =new Boat();
        obj.move();
        obj2.move();
        obj.carry();
        Circle c1=new Circle();
        c1.draw();
        Line l1=new Line();
        l1.draw();
        DemoClass myobj =new DemoClass();
        myobj.method1();
        myobj.method2();
    }
}