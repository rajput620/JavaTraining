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

    // 12 vertices: A,B,C,D,E,F,G,H,I,J,K,L
    GraphAL graph = new GraphAL(12);

    graph.addEdge(0, 1);   // A-B
    graph.addEdge(0, 7);   // A-H

    graph.addEdge(1, 2);   // B-C
    graph.addEdge(1, 3);   // B-D
    graph.addEdge(1, 10);  // B-K

    graph.addEdge(2, 8);   // C-I

    graph.addEdge(3, 4);   // D-E
    graph.addEdge(3, 5);   // D-F
    graph.addEdge(3, 7);   // D-H
    graph.addEdge(3, 10);  // D-K

    graph.addEdge(4, 6);   // E-G

    graph.addEdge(5, 8);   // F-I

    graph.addEdge(6, 9);   // G-J

    graph.addEdge(7, 11);  // H-L

    graph.addEdge(8, 9);   // I-J
    graph.addEdge(8, 10);  // I-K

    graph.printGraph();
}
}