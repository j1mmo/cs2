package ads2graph;

public class ADS2AdMGraph {
    //Step 1: Create a 2D array as underlying AdM
    //Also add a visited list for DFT
    int Matrix[][];
    private boolean visited[];
    private final int size;
    //Step 2: Initialise the array  and visited list using the number of vertices 
    ADS2AdMGraph(int numOfV){
        Matrix = new int[numOfV][numOfV];
        visited = new boolean[numOfV];
        size = numOfV;
    }
    
    
    //Step 3: Link two nodes by an edge
    //After this step, you can create a graph in the main Java class
    public void AddEdge(int index1, int index2, int weight){
        assert(index1 >= 0 && index1 < size);
        assert(index2 >= 0 && index2 < size);
        Matrix[index2][index1] = weight;
        Matrix[index1][index2] = weight;
    }
    
    //Step 4:Create some helper functions such as:
    public boolean IsAdjacent(int index1, int index2)
    {
        return Matrix[index1][index2] > 0;
    }
    
    public int GetWeight(int index1, int index2)
    {
        return Matrix[index1][index2];
    }
    
    public void printMatrix(){
        for(int i = 0; i < size;i++){
            for(int j = 0; j < size;j++){
                System.out.print(Matrix[i][j]+",");
            }
            System.out.println();
        }
    }
    //Step 5: Use Depth First Traversal to print all the vertices, you need to
    //Use a visited list to record any visited node. 
    public void DFT(int startID){
        assert(startID < size && startID >= 0);
        visited[startID] = true;
        System.out.print(startID);
        for(int i = 0; i < size; i++){
            if(IsAdjacent(i,startID) && visited[i] != true){
                System.out.print("->");
                DFT(i);
            }
        }
        System.out.println();
    }
}
