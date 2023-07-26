class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        for (int[] account : accounts) {
            int maxSum = 0;
            for (int i : account) {
                maxSum = maxSum + i;
            }
            sum = Math.max(sum, maxSum);
        }
        return sum;
    }
}