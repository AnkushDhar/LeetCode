class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\s", "");
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        StringBuilder sb1 = new StringBuilder();
        Stack<String> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            st.push(String.valueOf(s.charAt(i)));
        }
        while (!st.isEmpty()) {
            sb1.append(st.pop());
        }
        return s.contentEquals(sb1.toString());
    }
}