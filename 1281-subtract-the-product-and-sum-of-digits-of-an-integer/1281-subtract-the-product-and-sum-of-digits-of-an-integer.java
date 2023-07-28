class Solution {
    public int subtractProductAndSum(int n) {
        List<Integer> a = new ArrayList<>();
        while (n != 0) {
            a.add(n%10);
            n=n/10;
        }
        int p = 1;
        for (int i=0; i<a.size(); i++) {
            p = p*a.get(i);
        }
        int s = 0;
        for (int i=0; i<a.size(); i++) {
            s = s+a.get(i);
        }
        return p-s;
    }
}