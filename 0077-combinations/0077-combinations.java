class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(n, k, 1, new ArrayList<>(), result);
        return result;
    }
    
    private void backtrack(int n, int k, int start, List<Integer> current, List<List<Integer>> result) {
        if (k == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = start; i <= n - k + 1; i++) {
            current.add(i);
            backtrack(n, k - 1, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}
