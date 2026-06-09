import java.util.ArrayList;
import java.util.List;

public class GraphAL {
    // An array of Lists to represent the adjacency list
    private List<Integer>[] adjList;
    private int numVertices;

    // Constructor
    public GraphAL(int vertices) {
        this.numVertices = vertices;
        adjList = new ArrayList[vertices];

        // Initialize each element of the array as a new ArrayList
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    // Method to add an edge to the graph
    public void addEdge(int source, int destination) {
        // Add destination to source's list
        adjList[source].add(destination);

        // For undirected graph, add source to destination's list as well
        adjList[destination].add(source);
    }

    // Method to print the adjacency list
    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (int neighbor : adjList[i]) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a graph with 5 vertices (labeled 0 to 4)
        GraphAL graph = new GraphAL(5);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Print the graph
        graph.printGraph();
    }
}