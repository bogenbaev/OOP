package GeomShape;

import GeomShape.Color;
import GeomShape.Point;
import GeomShape.Shape;

public class Cirle extends Shape {
    private final Point center;
    private final double radius;
    public Cirle(Point center, double radius, Color color){
        super(color);
        this.center = center;
        this.radius = radius;
    }
    public Point getCenter(){
        return center;
    }
    public double getRadius(){
        return radius;
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public String toString(){
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                ", color=" + getColor() +
                '}';
    }

}
