import Graph.AdjList;
import java.util.Queue;

public class AdjQueueMatri {

    void BFS(int source) {
        Queue<E> q = new Queue(vertices);
        boolean visited[] = new boolean[vertices];
        q.enqueue(source);
        visited[source] = true;
        while (!q.isEmpty()) {
            int x = q.dequeue();
            System.out.println(x);
            for (int j = 0; i < vertices; j++) {
                if (matrix[x][j] != 0) {
                    if (!visited[j]) {
                        q.enqueue(j);
                        visited[j] = true;
                    }
                }
            }
        }
    }

    void depthfirstsearch(int source) {
        boolean visited[] = new boolean[vertices];
        dfs(source, visited);
    }

    void dfs(int rootnode, boolean[] visited) {
        System.out.println(rootnode);
        //get adj ad give the node
        visited[rootnode]=true;
        SingleLinkedListDemo.Node current = AdjList[rootnode].head;
        while(current!=null){
            if(visited[current.data]){
                dfs(current.data.visited);
            }
            current=current.next;
        }

    }

    public static void main(String[] args) {
        AdjQueueMatri adj = new AdjQueueMatri(5);
        adj.addEdges(0, 1);
        adj.addEdges(0, 2);
        adj.addEdges(1, 3);
        adj.addEdges(1, 4);
        adj.addEdges(2, 3);
        adj.addEdges(3, 4);
    }
}