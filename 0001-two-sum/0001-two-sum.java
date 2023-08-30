import java.util.*;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int [] ret = new int [2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int sum = nums[i]+nums[j];
                if(sum == target){
                    ret [0] = i;
                    ret [1] = j;
                }
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        int [] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}