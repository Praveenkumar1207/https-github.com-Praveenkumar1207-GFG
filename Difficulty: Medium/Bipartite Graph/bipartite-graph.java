class Solution {
       public boolean dfs(int src,int[] color,int[][] graph){
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            int ele = q.poll();
            for(int i  = 0; i < graph[ele].length; i++){
                if(color[graph[ele][i]] == -1){
                    if(color[ele] == 1){
                        color[graph[ele][i]] = 0;
                    }
                    else{
                        color[graph[ele][i]] = 1;
                    }
                    q.add(graph[ele][i]);
                }
                else if(color[graph[ele][i]] == color[ele]){
                    return false;
                }
                else{
                    continue;
                }
            }
        }
        return true;
    } 
    public static int[][] adjacencyList(int[][] edges, int n) {
        // Step 1: Create an array of lists
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        // Step 2: Populate adjacency lists
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj[u].add(v);
            adj[v].add(u); // remove this line if the graph is directed
        }

        // Step 3: Convert List<Integer>[] to int[][]
        int[][] adjArray = new int[n][];
        for (int i = 0; i < n; i++) {
            List<Integer> neighbors = adj[i];
            adjArray[i] = new int[neighbors.size()];
            for (int j = 0; j < neighbors.size(); j++) {
                adjArray[i][j] = neighbors.get(j);
            }
        }

        return adjArray;
    }

    public boolean isBipartite(int n, int[][] edges) {
        int[][] graph = adjacencyList(edges,n);
        int[] color = new int[n];
        Arrays.fill(color,-1);

        for(int i = 0; i < n; i++){
            if(color[i] == -1){
                if(dfs(i,color,graph) == false){
                    return false;
                }
            }
        }
        return true;
    }
}