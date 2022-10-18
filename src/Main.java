package src;

import GeomShape.*;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double xTopLeft = sc.nextDouble();
        double yTopLeft = sc.nextDouble();
        Point corner = new Point(xTopLeft, yTopLeft);
        double size = sc.nextDouble();
        Square mySqare = new Square(corner, size);
        System.out.println("Area: " + mySqare.getArea());
        System.out.println("Perimeter: " + mySqare.getCircumference());
        System.out.println("Color: " + mySqare.getColor());
        System.out.println("isFilled: " + mySqare.isFilled());
        mySqare.setColor(Color.WHITE);
        System.out.println("Color: " + mySqare.getColor());
        HashMap<Shape, String> myHM = new HashMap<>();
        corner.setX(0);
        corner.setY(0);
        Circle myCircle = new Circle(corner, 1);
        Point sideCorner = new Point(3, 0);
        corner.setY(1);
        Rectangle myRectangle = new Rectangle(corner, sideCorner);
        Square mySquare = new Square(corner, 1);
        myHM.put(myCircle, "CIRCLES");
        myHM.put(myCircle, "RECTANGLES");
        myHM.put(myCircle, "SQUARES");
        System.out.println("INITIAL - " + myHM.size() + " " + myHM.get(myCircle));
        corner.setX(0);
        corner.setY(0);
        Circle anotherCircle = new Circle(corner, 1);
        myHM.put(anotherCircle, "SAME CIRCLES");
        System.out.println("ADDED CIRCLE WITH SAME ATTRIBUTES - " + myHM.size() + " " + myHM.get(myCircle));
    }
}
