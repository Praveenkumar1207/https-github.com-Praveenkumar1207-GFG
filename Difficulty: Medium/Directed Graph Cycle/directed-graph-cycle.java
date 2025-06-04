class Solution {
    public static List<Integer>[] adjacencyList(int V,int[][] edges){
        List<Integer>[] adj = new ArrayList[V];
        for(int i = 0; i < V; i++){
            adj[i] = new ArrayList<>(); 
        }
        for(int i = 0;i < edges.length; i++){
            adj[edges[i][0]].add(edges[i][1]);
        }
        return adj;
    }
    public static boolean dfs(int node,boolean[] vis, boolean[] stack,List<Integer>[] adj){
        if(stack[node] == true){
            return true;
        }
        
        if(vis[node] == true){
            return false;
        }
        
        vis[node] = true;
        stack[node] = true;
        
        for(int i :adj[node]){
            if(dfs(i,vis,stack,adj)){
                return true;
            }
        }
        stack[node] = false;
        return false;
    }
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        boolean[] vis = new boolean[V];
        boolean[] stack = new boolean[V];
        List<Integer>[] adj = adjacencyList(V,edges);
        
        for(int i = 0; i < V; i++){
            if(!vis[i] && dfs(i,vis,stack,adj)){
                return true;
            }
        }
        return false;
    }
}