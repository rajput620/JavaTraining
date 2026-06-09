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
            "A", "B", "C", "D", "E", "F", "G", "J", "K"
        };

        GraphMatrix graph = new GraphMatrix(vertices);

        graph.addEdge(0, 1); // A-B
        graph.addEdge(0, 2); // A-C
        graph.addEdge(1, 3); // B-D
        graph.addEdge(2, 4); // C-E
        graph.addEdge(3, 5); // D-F
        graph.addEdge(5, 6); // F-G
        graph.addEdge(6, 7); // G-J
        graph.addEdge(7, 8); // J-K

        graph.printGraph();
    }
}