class Solution {
    public static int[] sortArray(int[] nums) {
        margeSort(nums, 0, nums.length-1);
        return (nums);
    }
    public static void margeSort (int [] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si)/2;
        margeSort(arr, si, mid); // left part
        margeSort(arr, mid+1, ei); // right part
        merge (arr, si, mid, ei);
    }
    public static void merge (int [] arr, int si, int mid, int ei) {
        int [] temp = new int[ei-si+1];
        int i = si; // iterator for left part
        int j = mid+1; // iterator for right part
        int k = 0; // iterator temp array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
}