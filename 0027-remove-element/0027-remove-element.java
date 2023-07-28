class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        List<Integer> l = new ArrayList<>();
        for (int i=0; i<n; i++) {
            if(nums[i] != val) {
                l.add(nums[i]);
            }
        }
        for(int i=0; i<l.size(); i++) {
            nums[i] = l.get(i);
        }
        return l.size();
    }
}