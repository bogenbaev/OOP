package GeomShape;
public class Shape{
    public Color color;
    public boolean filled;
    public Shape() {
        color = Color.RED;
        filled = true;
    }
    public Shape(Color color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public Color getColor(){
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public boolean isFilled() {
        return this.filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public double getArea() {
        return Double.NaN;
    }
    public double getCircumference() {
        return Double.NaN;
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
    public String toString() {
        return "MyShape{" +
                "color=" + color +
                ", isFilled=" + filled +
                "}";
    }
}
