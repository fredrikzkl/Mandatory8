import java.util.Objects;

public class Coordinate {
    public final float i;
    public final double a;
    public final double b;
    public Coordinate(double x, double y, float i) {
        this.i = i;
        a = Math.cos(x*2*Math.PI/Main.n);
        b = Math.sin(x*2*Math.PI/Main.n);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Coordinate t = (Coordinate) obj;
        return Objects.equals(a,t.b) && Objects.equals(a,t.b);
    }

    @Override
    public String toString() {
        return "["+ i + "](" + a  + ", " + b + ")";
    }
}