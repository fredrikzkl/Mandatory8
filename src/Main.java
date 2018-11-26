import java.util.ArrayList;
import java.util.List;

public class Main {

    private List<Integer> X;
    private List<Integer> Y;

    public Main(int size){

        int n = size;
        int[] consts = {-2,0,2,-1,1,-3,3};

        X = new ArrayList<>();
        Y = new ArrayList<>();

        //X
        for(int i = 1; i != n; i++){
            for(int j = 0; j < consts.length; j++){
                int temp = (i * n/8) + consts[j];
                X.add(temp);
            }
        }


        for(int i = 1; i != n; i++){
            for(int j = 0; j < consts.length; j++){
                int temp = (i * n/5) + consts[j];
                Y.add(temp);
            }
        }
        System.out.println("X size: " + X.size() + ", Y size: "+  Y.size());

        //Lets try those god damn edges

        List<Edge> XEdge = new ArrayList<>();
        List<Edge> YEdge = new ArrayList<Edge>();

        for(int i = 0 ; i < X.size(); i++){
            //Closing da loop
            if(i == X.size()-1){
                XEdge.add(new Edge(X.get(i),X.get(0)));
                YEdge.add(new Edge(Y.get(i),Y.get(0)));
            }else{
                XEdge.add(new Edge(X.get(i),X.get(i+1)));
                YEdge.add(new Edge(Y.get(i),Y.get(i+1)));
            }
        }


        List<Edge> common = getCommonEdges(XEdge,YEdge);
        System.out.println(common.size());

    }

    public double coorinatify(float point, int n){
        return Math.cos(point*2*Math.PI/n);
    }

    public List<Edge> getCommonEdges(List<Edge> X, List<Edge> Y){
        List<Edge> commonEdges = new ArrayList<>();
        for(int i = 0; i < X.size(); i++) {
            for (int j = 0; j < Y.size(); j++) {
                if (X.get(i).equals(Y.get(j))) commonEdges.add(X.get(i));
            }
        }
        return commonEdges;
    }

    public List<Tuple> getCommonTuples(List<Tuple> X, List<Tuple> Y){
        List<Tuple> commonEdges = new ArrayList<>();
        for(int i = 0; i < X.size(); i++) {
            for (int j = 0; j < Y.size(); j++) {
                if (X.get(i).equals(Y.get(j))) commonEdges.add(X.get(i));
            }
        }
        return commonEdges;
    }


    public static void main(String[] args) {
        new Main(32);
    }
}
