class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n-1; i++) {
            if (arr[i] != arr[i+1]) {
                l.add(arr[i]);
            }
        }
        l.add(arr[n-1]);
        for (int i = 0; i < l.size(); i++) {
            arr[i] = l.get(i);
        }
        return l.size();
    }
}