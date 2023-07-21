class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int [] newArr = new int[n+1];
        newArr[0] = 0;
        System.arraycopy(nums, 0, newArr, 1, newArr.length - 1);
        for (int i = 1; i < newArr.length; i++) {
            if (n%i == 0) {
                sum = sum + newArr[i]*newArr[i];
            }
        }
        return sum;
    }
}