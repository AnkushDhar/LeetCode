class Solution {
    public boolean canWinNim(int n) {
        if (n <= 3) {
            return true;
        }
        if ((n/2) % 2 != 0 || n % 2 != 0) {
            return true;
        }
        return false;
    }
}