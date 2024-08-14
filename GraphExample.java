import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphExample {

        //Number of vertices
        private int V;
        //Adjacency list representation
        private List<List<Integer>>adjacencyList;

        public GraphExample(int V)
        {
            this.V=V;
            adjacencyList=new ArrayList<>(V);

            //Initialize the adjacency list
            for (int i=0;i<V;i++)
            {
                adjacencyList.add(new ArrayList<>());
            }
        }

        //Function to add an edge between two vertices
        public void addEdge(int source,int destination)
        {
            adjacencyList.get(source).add(destination);
            adjacencyList.get(destination).add(source);

        }

        //Function to perform Breadth-First Search of the graph
    public void bfs(int startVertex)
    {
        boolean[]visited=new boolean[V];
        Queue<Integer>queue=new LinkedList<>();

        visited[startVertex]=true;
        queue.add(startVertex);
        while (!queue.isEmpty())
        {
            int currentVertex= queue.poll();
            System.out.println(currentVertex+" ");

            List<Integer> neighbors = adjacencyList.get(currentVertex);

            for (int neighbor:neighbors)
            {
                if(!visited[neighbor])
                {
                    visited[neighbor]=true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();

    }
    //Funct


}
