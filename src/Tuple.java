import java.util.Objects;

public class Tuple {
    public final float i;
    public final double x;
    public final double y;
    public Tuple(float i, double x, double y) {
        this.i = i;
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Tuple t = (Tuple) obj;
        return Objects.equals(x,t.x) && Objects.equals(y,t.y);
    }

    @Override
    public String toString() {
        return "["+ i + "](" + x  + ", " + y + ")";
    }
}