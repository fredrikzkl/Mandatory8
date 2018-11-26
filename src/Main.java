import java.util.ArrayList;
import java.util.List;

public class Main {

    private List<Integer> X;
    private List<Integer> Y;

    public static final int n = 64;

    public Main(){

        int[] xconsts1 = {-2,0,2,-1,1,+3};
        int[] xconsts3 = {-3,-1,1,-2,0,2};
        int[] xconsts7 = {-3,3,-2,0,2,-1,1,4};


        X = new ArrayList<>();
        Y = new ArrayList<>();



        //X
        boolean slayed1 = false;
        boolean slayed2 = false;
        boolean slayed3 = false;
        int counter = 1;

        while(true){
            //First x
            if(counter == CF(1,-2) && !slayed1){
                for(int i  = 0 ; i < xconsts1.length - 1; i++){
                    X.add(CF(1,xconsts1[i]));
                }
                counter = CF(1,xconsts1[xconsts1.length-1]);
                slayed1 = true;
                continue;
            }

            //Second x
            if(counter == CF(3,-3) && !slayed2){
                for(int i  = 0 ; i < xconsts3.length - 1; i++){
                    X.add(CF(3,xconsts3[i]));
                }
                counter = CF(3,xconsts3[xconsts3.length-1]);
                slayed2 = true;
                continue;
            }

            //Third x
            if(counter == CF(7,-3) && !slayed3){
                for(int i  = 0 ; i < xconsts7.length - 1; i++){
                    X.add(CF(7,xconsts7[i]));
                }
                counter = CF(7,xconsts7[xconsts7.length-1]);
                slayed3 = true;
                continue;
            }

            X.add(counter);
            counter++;
            System.out.println(counter);
            if(counter > n) break;
        }

        counter = 1;
        slayed1 = false;

        while(true){
            if(counter == CF(5,-2) && !slayed1){
                for(int i  = 0 ; i < xconsts1.length - 1; i++){
                    Y.add(CF(5,xconsts1[i]));
                }
                counter = CF(5,xconsts1[xconsts1.length-1]);
                slayed1 = true;
                continue;
            }
            Y.add(counter);
            counter++;
            if(counter > n) break;
        }

        System.out.println(X);
        System.out.println(Y);
        /*
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
        List<Coordinate> Xcoordinates = new ArrayList<>();
        List<Coordinate> Ycoordinates = new ArrayList<>();



        for(int i = 0 ; i < X.size(); i++){
            //Closing da loop
            if(i == X.size()-1){
                XEdge.add(new Edge(X.get(i),X.get(0)));
                YEdge.add(new Edge(Y.get(i),Y.get(0)));
            }else{
                XEdge.add(new Edge(X.get(i),X.get(i+1)));
                YEdge.add(new Edge(Y.get(i),Y.get(i+1)));
            }

            Xcoordinates.add(new Coordinate(X.get(i)));
            Ycoordinates.add(new Coordinate(Y.get(i)));
        }


        List<Edge> common = getCommonEdges(XEdge,YEdge);
        System.out.println("Common edges: " +  common.size() + " :: " + common);


        List<Coordinate> commonC = getCommonCoordinates(Xcoordinates,Ycoordinates);
        System.out.println("Common coordz: " +  commonC.size() + " :: " + commonC);

*/

    }

    public int CF(int row, int con){
        return (row * n)/8 + con;
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

    public List<Coordinate> getCommonCoordinates(List<Coordinate> X, List<Coordinate> Y){
        List<Coordinate> commonEdges = new ArrayList<>();
        for(int i = 0; i < X.size(); i++) {
            for (int j = 0; j < Y.size(); j++) {
                if (X.get(i).equals(Y.get(j))) commonEdges.add(X.get(i));
            }
        }
        return commonEdges;
    }


    public static void main(String[] args) {
        new Main();
    }
}
