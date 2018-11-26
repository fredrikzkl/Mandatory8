public class Edge {

    private int origin;
    private int destination;

    public Edge(int origin, int destination){
        this.origin = origin;
        this.destination = destination;

    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        Edge e = (Edge) o;
        return origin == e.origin && destination == e.destination;
    }

    @Override
    public String toString() {
        return "{" + origin + ", " + destination + "}";
    }
}
