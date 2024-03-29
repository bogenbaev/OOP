package GeomShape;

public class Square extends Rectangle {
    private Point corner;
    private double size;
    public Square(){
        this.corner.setY(0);
        this.corner.setX(0);
        this.size = 1;
    }
    public Square(Point corner, double size){
        this.corner = corner;
        this.size = size;
    }

    public Square(Point corner, double size, Color color, boolean filled){
        super(null,null, color, filled);
        this.corner = corner;
        this.size = size;
    }

    @Override
    public double getArea() {
        return size * size;
    }

    @Override
    public double getCircumference() {
        return 4 * size;
    }

    public double getSize() {
        return size;
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
        return "which is subclass of " +
                super.toString() +
                '}';
    }
}
