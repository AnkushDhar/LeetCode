import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    private int time = 0;
    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer>[] graph;
    
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (List<Integer> connection : connections) {
            int a = connection.get(0);
            int b = connection.get(1);
            graph[a].add(b);
            graph[b].add(a);
        }
        int[] low = new int[n];
        int[] disc = new int[n];
        Arrays.fill(disc, -1);
        for (int i = 0; i < n; i++) {
            if (disc[i] == -1) {
                dfs(i, low, disc, i);
            }
        }
        return result;
    }
    
    private void dfs(int u, int[] low, int[] disc, int pre) {
        disc[u] = low[u] = ++time;
        for (int v : graph[u]) {
            if (v == pre) continue;
            if (disc[v] == -1) {
                dfs(v, low, disc, u);
                low[u] = Math.min(low[u], low[v]);
                if (low[v] > disc[u]) result.add(Arrays.asList(u, v));
            } else {
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }
}
