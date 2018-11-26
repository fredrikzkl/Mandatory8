import java.util.Objects;

public class Coordinate {

    public final double a;
    public final double b;
    public Coordinate(double point) {

        a = Math.cos(point*2*Math.PI/Main.n);
        b = Math.sin(point*2*Math.PI/Main.n);
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
        return "(" + a  + ", " + b + ")";
    }
}