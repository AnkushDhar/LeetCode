class Solution {
    public int theMaximumAchievableX(int num, int t) {
        for (int i=1; i<=t; i++) {
            num = num+1;
        }
        return num+t;
    }
}