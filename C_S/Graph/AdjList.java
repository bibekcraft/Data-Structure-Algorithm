package Graph;

import linkedlist.SingleLinkedListDemo;

public class AdjList {
    SingleLinkedListDemo adjlist[];
    int vertices;

    // Constructor to initialize the adjacency list
    AdjList(int vertices) {
        this.vertices = vertices;
        adjlist = new SingleLinkedListDemo[vertices];
        for (int i = 0; i < vertices; i++) {
            adjlist[i] = new SingleLinkedListDemo();
        }
    }

    // Method to add edges to the graph
    void addEdges(int u, int v) {
        adjlist[u].append(v); // Add edge from u to v
        adjlist[v].append(u); // Add edge from v to u (for undirected graph)
    }
x
    // Method to print the adjacency list representation of the graph
    void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print( i + "is connected to");
            SingleLinkedListDemo.Node(current =adjlist[i].head)
            while(current=null{
                System.out.print(current.data);
                current  = current.next;
            }
            System.out.println();
        }
    }

    // Method to print the adjacency matrix representation of the graph
    void printMatrix() {
        int[][] matrix = new int[vertices][vertices];

        // Fill the adjacency matrix
        for (int i = 0; i < vertices; i++) {
            SingleLinkedListDemo list = adjlist[i];
            // Assuming you have a way to iterate through the linked list
            for (int j = 0; j < list.size(); j++) { // Assuming size() gives the number of nodes
                int v = list.getNode(j); // Assuming getNode(j) returns the value at index j
                matrix[i][v] = 1; // Mark the presence of an edge
            }
        }

        // Print the adjacency matrix
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjList adj = new AdjList(5);
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