package GeomShape;

import src.Main;

public class Rectangle extends Shape {
   private Point topCorner;
   private Point sideCorner;
   private double topSize;
   private double sideSize;
   public Rectangle(){
        this.topCorner.setY(0);
        this.topCorner.setX(0);
        this.sideCorner.setX(1);
        this.sideCorner.setY(-1);
        this.topSize = 1;
        this.sideSize = 1;
   }
   public Rectangle(Point topCorner, Point sideCorner) {
        this.topCorner = topCorner;
        this.sideCorner = sideCorner;
        this.topSize = Math.abs(topCorner.getX() - sideCorner.getX());
        this.sideSize = Math.abs(topCorner.getY() - sideCorner.getY());
   }
    public Rectangle(Point topCorner, Point sideCorner, Color color, boolean filled) {
        super(color, filled);
        this.topCorner = topCorner;
        this.sideCorner = sideCorner;
        this.topSize = Math.abs(topCorner.getX() - sideCorner.getX());
        this.sideSize = Math.abs(topCorner.getY() - sideCorner.getY());
    }
   public Point getTopCorner(){
       return topCorner;
   }
    public Point getSideCorner(){
        return sideCorner;
    }
   public double getTopSize(){
       return topSize;
   }
    public double getSideSize(){
        return sideSize;
    }
    @Override
    public double getArea() {
       return topSize * sideSize;
    }
    @Override
    public double getCircumference() {
       return 2 * (topSize + sideSize);
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
    public String toString(){
       return "which is subclass of" +
               super.toString() +
               '}';
    }
}
