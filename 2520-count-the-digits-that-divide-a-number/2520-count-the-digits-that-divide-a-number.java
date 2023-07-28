class Solution {
    public int countDigits(int num) {
        int x = num;
        List<Integer> l = new ArrayList<>();
        while (x != 0) {
            l.add(x%10);
            x = x/10;
        }
        int c = 0;
        for (int i=0; i<l.size(); i++) {
            if (num%l.get(i) == 0) {
                c++;
            }
        }
        return c;
    }
}