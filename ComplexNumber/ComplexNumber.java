package ComplexNumber;

public class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im){
        this.re = re;
        this.im = im;
    }

    public double getRe(){
        return re;
    }

    public double getIm() {
        return im;
    }

    public int hashCode(){
        int result = 17;
        long longBits = Double.doubleToLongBits(getRe());
        result = 37 * result + (int)(longBits - (longBits >>> 32));
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof ComplexNumber) {
            ComplexNumber other = (ComplexNumber) obj;
            if (other.getRe() != getRe())
                return false;
            if (other.getIm() != getIm())
                return false;
            if (other.getClass() != getClass())
                return false;
            return true;
        }
        return false;
    }

}
