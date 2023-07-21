class Solution {
    public boolean isPalindrome(int x) {
      String st = Integer.toString(x);
        StringBuilder s = new StringBuilder(Integer.toString(x));
        StringBuilder rs = s.reverse();
        String st1 = rs.toString();
        return st.equals(st1);  
    }
}