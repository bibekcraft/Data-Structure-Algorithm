public class AdjMatrix {

    // mst
    public static class Edge implements Comparable<Edge> {
        int u;
        int v;
        int w;

        Edge(int u,intv , int w){
            this.u=u;
            this.v=v;
            this.w=w;

        }

        @Override
        public int compare(Edge o) {
            return this.w - o.w;
        }
    }

    // mst end
    int[][] matrix;
    int vertices;
    Edge[] edges;
    int edgeindex = -1;

    AdjMatrix(int vertices){
        this.vertices=vertices
        matrix=new int[vertices][vertices];
        edges=new Edge[vertices*(vertices-1)/2]
    }

    void addEdges(int u,int v,int w){
        matrix[u][v]=w;
        matrix[v][u]=w;
        edges[++edgeindex]=new Edge(u,v,w) //must adding edge to list
    }

    void kruskalAlgorith(Edges ){
        int parent[]=new int[vertices];
        int size[]=new int[vertices];
        int mst[][]=new int[vertices][vertices];
        for (int i=0;i<vertices;i++){
            parent[i]=-1;
        }
        Arrays.sort(edges);
        int edgeTaken=0;
        int edgeCounter=-1;
        while(edgeTaken<vertices){
            Edge e=edges[++edgeCounter];    
            int uabsroot=find(e.u,parent);
            int vbasroot=find(e.v.parent);
            int(uabsroot==vbasroot){
                //[cycle detected]
                continue;
            }
            mst[e.u][e.v]=e.w;
            mst[e.v][e.u]=e.w;
            union(usabroot)
        }

    }

    
}
