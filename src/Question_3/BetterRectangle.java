package Question_3;

import java.awt.*;

public class BetterRectangle extends Rectangle {
    double length;
    double breadth;

    public BetterRectangle(double length, double breadth) {
        super();
        setSize((int)length, (int) breadth);
        setLocation((int)length,(int)breadth);
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea(){
        double area = this.length*this.breadth;
        return area;

    }
    public double getPerimeter(){
        double perimeter = 2*(this.length+this.breadth);
        return perimeter;
    }

}
class Tester{
    public static void main(String[] args) {
        BetterRectangle betterRectangle = new BetterRectangle(10,12);
        System.out.println(betterRectangle.getArea());
        System.out.println(betterRectangle.getPerimeter());

    }
}
