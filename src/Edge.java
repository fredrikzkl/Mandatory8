import java.util.Objects;

public class Edge {

    private Coordinate origin;
    private Coordinate destination;

    public Edge(Coordinate origin, Coordinate destination){
        this.origin = origin;
        this.destination = destination;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return (Objects.equals(origin, edge.origin) &&
                Objects.equals(destination, edge.destination))
                || (Objects.equals(origin, edge.destination) &&
                Objects.equals(destination, edge.origin));
    }

    @Override
    public int hashCode() {
        return Objects.hash(origin, destination);
    }

    @Override
    public String toString() {
        return "{" + origin + ", " + destination + "}";
    }
}
