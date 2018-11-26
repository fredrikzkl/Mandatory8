import java.util.ArrayList;
import java.util.List;

public class Main {
    static final int n = 64;

    private Main(){
        int[] xconsts1 = {-2,0,2,-1,1,+3};
        int[] xconsts3 = {-3,-1,1,-2,0,2};
        int[] xconsts7 = {-3,3,-2,0,2,-1,1,4};

        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        //X
        boolean slayed1 = false;
        boolean slayed2 = false;
        boolean slayed3 = false;
        int counter = 1;

        while(true){
            //First x
            if(counter == CF(1,-2) && !slayed1){
                for(int i  = 0 ; i < xconsts1.length - 1; i++){
                    x.add(CF(1,xconsts1[i]));
                }
                counter = CF(1,xconsts1[xconsts1.length-1]);
                slayed1 = true;
                continue;
            }

            //Second x
            if(counter == CF(3,-3) && !slayed2){
                for(int i  = 0 ; i < xconsts3.length - 1; i++){
                    x.add(CF(3,xconsts3[i]));
                }
                counter = CF(3,xconsts3[xconsts3.length-1]);
                slayed2 = true;
                continue;
            }

            //Third x
            if(counter == CF(7,-3) && !slayed3){
                for(int i  = 0 ; i < xconsts7.length - 1; i++){
                    x.add(CF(7,xconsts7[i]));
                }
                counter = CF(7,xconsts7[xconsts7.length-1]);
                slayed3 = true;
                continue;
            }

            x.add(counter);
            counter++;
            if(counter > n) break;
        }

        counter = 1;
        slayed1 = false;

        while(true){
            if(counter == CF(5,-2) && !slayed1){
                for(int i  = 0 ; i < xconsts1.length - 1; i++){
                    y.add(CF(5,xconsts1[i]));
                }
                counter = CF(5,xconsts1[xconsts1.length-1]);
                slayed1 = true;
                continue;
            }
            y.add(counter);
            counter++;
            if(counter > n) break;
        }

        System.out.println(x);
        System.out.println(y);

        //Lets try those god damn edges
        List<Edge> XEdge = new ArrayList<>();
        List<Edge> YEdge = new ArrayList<>();
        List<Coordinate> Xcoordinates = new ArrayList<>();
        List<Coordinate> Ycoordinates = new ArrayList<>();

        for(int i = 0; i < x.size(); i++){
            Xcoordinates.add(new Coordinate(x.get(i)));
            Ycoordinates.add(new Coordinate(y.get(i)));
        }

        
        List<Coordinate> commonC = new ArrayList<>(Xcoordinates);
        commonC.retainAll(Ycoordinates);
        System.out.println("Common coordz: " +  commonC.size() + " :: " + commonC);

        for (int i = 0; i < Xcoordinates.size(); i++) {
            Coordinate coordinate = Xcoordinates.get(i);
            if (i == Xcoordinates.size() - 1) {
                XEdge.add(new Edge(coordinate, Xcoordinates.get(0)));
            } else {
                XEdge.add(new Edge(coordinate, Xcoordinates.get(i + 1)));
            }
        }
        for (int i = 0; i < Ycoordinates.size(); i++) {
            Coordinate coordinate = Ycoordinates.get(i);
            if (i == Ycoordinates.size() - 1) {
                YEdge.add(new Edge(coordinate, Xcoordinates.get(0)));
            } else {
                YEdge.add(new Edge(coordinate, Ycoordinates.get(i + 1)));
            }
        }
        System.out.println(XEdge);
        System.out.println(YEdge);
        List<Edge> commonEdges = new ArrayList<>(XEdge);
        commonEdges.retainAll(YEdge);
        System.out.println("Common edges: " + commonEdges.size() + " :: " + commonEdges);
    }

    private int CF(int row, int con){
        return (row * n)/8 + con;
    }

    public static void main(String[] args) {
        new Main();
    }
}
