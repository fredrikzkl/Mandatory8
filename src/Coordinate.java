import java.util.Objects;

public class Coordinate {

    public final double a;
    public final double b;
    public final int point;
    public Coordinate(double point) {
        this.point = (int) point;
        a = Math.cos(point*2*Math.PI/Main.n);
        b = Math.sin(point*2*Math.PI/Main.n);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return Double.compare(that.a, a) == 0 &&
                Double.compare(that.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return String.valueOf(point);
        //return "(" + a  + ", " + b + ")";
    }
}