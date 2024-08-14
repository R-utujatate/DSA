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
    //Function to perform Depth-First Search traversal of the graph
    public void dfs(int startVertex)
    {
        boolean[] visited = new boolean[V];
        dfsUtil(startVertex,visited);
        System.out.println();
    }

    private void dfsUtil(int vertex,boolean[] visited)
    {
        visited[vertex]=true;
        System.out.println(vertex+" ");

        List<Integer>neighbors = adjacencyList.get(vertex);
        for (int neighbor:neighbors)
        {
            if (!visited[neighbor])
            {
                dfsUtil(neighbor,visited);
            }
        }

    }

    public static void main(String[] args) {
            //Number of vertices
        int V=5;
        GraphExample graph = new GraphExample(V);

        //Add edges
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(2,4);

        System.out.println("BFS traversal: ");
        graph.bfs(0);

        System.out.println("DFS traversal: ");
        graph.dfs(0);

    }


}
