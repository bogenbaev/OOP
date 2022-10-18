package GeomShape;

public class Circle extends Shape {
    private Point center;
    private double radius;
    public Circle() {
        this.center.setX(0);
        this.center.setY(0);
        this.radius = 1;
    }
    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }
    public Circle(Point center, double radius, Color color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
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
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    @Override
    public int hashCode() {
        int result = 17;
        if (color != null) {
            result = 31 * result + color.hashCode();
        }
        if (filled) {
            result = 37 * result;
        }
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Shape myShape = (Shape) obj;
        return color.equals(myShape.getColor()) &&
                filled == myShape.isFilled();
    }
    @Override
    public String toString(){
        return "which is subclass of" +
                super.toString() +
                '}';
    }

}
