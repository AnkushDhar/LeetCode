class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            if (Objects.equals(operation, "--X")) {
                --x;
            } else if (Objects.equals(operation, "++X")) {
                ++x;
            } else if (Objects.equals(operation, "X++")) {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }
}