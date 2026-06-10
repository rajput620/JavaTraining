public class GraphMatrix {

    private int[][] adjacencyMatrix;
    private String[] vertices;

    public GraphMatrix(String[] vertices) {
        this.vertices = vertices;
        adjacencyMatrix = new int[vertices.length][vertices.length];
    }

    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1;
    }

    public void printGraph() {

        System.out.print("  ");

        for (String v : vertices) {
            System.out.print(v + " ");
        }

        System.out.println();

        for (int i = 0; i < vertices.length; i++) {

            System.out.print(vertices[i] + " ");

            for (int j = 0; j < vertices.length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

String[] vertices = {
    "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"
};

GraphMatrix graph = new GraphMatrix(vertices);

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