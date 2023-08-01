class Solution {
    public static int maxArea(int[] height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.length-1;
        while(lp<rp){
            int h = Math.min(height[lp], height[rp]);
            int w = rp - lp;
            int currWater = h*w;
            maxWater = Math.max(maxWater, currWater);
            if(height[lp]<height[rp]){
                lp = lp+1;
            }else{
                rp = rp-1;
            }
        }
        return maxWater;
    }
    public static void main (String [] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}