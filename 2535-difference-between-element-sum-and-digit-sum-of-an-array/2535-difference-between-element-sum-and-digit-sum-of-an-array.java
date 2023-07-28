class Solution {
    public int differenceOfSum(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int elSum = 0;
        for (int i=0; i<nums.length; i++) {
            elSum = elSum + nums[i];
        }
        for (int i=0; i<nums.length; i++) {
            while (nums[i] != 0) {
                l.add(nums[i]%10);
                nums[i] = nums[i]/10;
            }
        }
        int dSum = 0;
        for(int i=0; i<l.size(); i++) {
            dSum = dSum+l.get(i);
        }
        return Math.abs(elSum-dSum);
    }
}