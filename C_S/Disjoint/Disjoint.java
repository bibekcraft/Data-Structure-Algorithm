public class Disjoint {
    private int[] parent;

    // Constructor to initialize the disjoint set
    public Disjoint(int vertices) {
        parent = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parent[i] = -1; // Every node is its own root initially
        }
    }

    // Find the absolute root of a node with path compression
    public int find(int u) {
        if (parent[u] < 0) {
            return u; // `u` is its own root
        }
        return parent[u] = find(parent[u]); // Path compression
    }

    // Union two sets and return true if union was successful
    public boolean union(int u, int v) {
        int rootU = find(u);
        int rootV = find(v);

        if (rootU == rootV) {
            return false; // `u` and `v` are already in the same set (cycle detected)
        }

        // Union by size
        if (parent[rootU] < parent[rootV]) { // rootU has more members
            parent[rootU] += parent[rootV];
            parent[rootV] = rootU;
        } else { // rootV has more members or they're equal
            parent[rootV] += parent[rootU];
            parent[rootU] = rootV;
        }

        return true;
    }

    // Check if adding an edge forms a cycle
    public boolean findCycle(int u, int v) {
        return !union(u, v);
    }

    public static void main(String[] args) {
        // Example usage
        Disjoint disjointSet = new Disjoint(5); // Create a disjoint set with 5 elements
        System.out.println(disjointSet.findCycle(0, 1)); // false, no cycle
        System.out.println(disjointSet.findCycle(1, 2)); // false, no cycle
        System.out.println(disjointSet.findCycle(2, 0)); // true, cycle detected
    }
}
