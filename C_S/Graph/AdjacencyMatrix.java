import java.util.ArrayList;
import java.util.List;

public class AdjacencyMatrix {
    int[][] matrix;
    int vertices;

    AdjacencyMatrix(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    void addEdges(int u, int v) {
        matrix[u][v] = 1;
        matrix[v][u] = 1;
    }

    List<Integer> getAdjNodes(int i) {
        List<Integer> adjNodes = new ArrayList<>();
        for (int j = 0; j < vertices; j++) {
            if (matrix[i][j] != 0) {
                adjNodes.add(j);
            }
        }
        return adjNodes;
    }

    ///print matrix here 
    /// 
    void printMatrix() {
        System.out.println("\nAdjacency Matrix Representation:");
        System.out.print("  "); // Space for alignment
        // Print column headers
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Print matrix with row headers
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            List<Integer> neighbors = getAdjNodes(i);
            for (int j = 0; j < neighbors.size(); j++) {
                System.out.print(neighbors.get(j));
                if (j < neighbors.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjacencyMatrix adj = new AdjacencyMatrix(5);
        adj.addEdges(0, 1);
        adj.addEdges(0, 2);
        adj.addEdges(3, 4);
        adj.addEdges(1, 3);
        adj.addEdges(1, 4);
        adj.addEdges(2, 3);
        adj.printGraph();
        adj.printMatrix();
    }
}
