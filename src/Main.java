import java.util.ArrayList;
import java.util.List;

public class Main {

    private List<Tuple> X;
    private List<Tuple> Y;

    public Main(int size){

        int n = size;
        int[] consts = {-2,0,2,-1,1,-3,3};

        X = new ArrayList<Tuple>();
        Y = new ArrayList<Tuple>();

        //X
        for(int i = 1; i != n; i++){
            for(int j = 0; j < consts.length; j++){
                float temp = (i * n/8) + consts[j];
                X.add(new Tuple(temp,Math.cos(temp*2*Math.PI/n),Math.sin(temp*2*Math.PI/n)));
            }
        }


        for(int i = 1; i != n; i++){
            for(int j = 0; j < consts.length; j++){
                float temp = (i * n/5) + consts[j];
                X.add(new Tuple(temp,Math.cos(temp*2*Math.PI/n),Math.sin(temp*2*Math.PI/n)));
            }
        }

        List<Tuple> commonEdges = new ArrayList<>();
        for(int i = 0; i < X.size(); i++) {
            for (int j = 0; j < Y.size(); j++) {
                if (X.get(i).equals(Y.get(j))) commonEdges.add(X.get(i));
            }
        }

        System.out.println(commonEdges.size());
    }

    public void PrintArry(List<Object> l){
        for(int i = 0; i < l.size() ; i++){
            System.out.println(l.get(i));
        }
    }


    public static void main(String[] args) {
        new Main(64);
    }
}
