class Solution {
    public static int[] countBits(int n) {
        int [] arr = new int[n+1];
        for (int i = 0; i < arr.length; i++) {
            String s = Integer.toBinaryString(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 49) {
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}