class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\s", "");
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int si = 0;
        int ei = s.length()-1;
        boolean b = true;
        for (int i = si, j = ei; i<s.length()/2; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return b;
    }
}