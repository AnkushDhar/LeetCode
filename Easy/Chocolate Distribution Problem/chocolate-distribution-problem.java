//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0;i<n;i++)
                {
                    int x = sc.nextInt();
                    arr.add(x);
                }
            int m = sc.nextInt();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public long findMinDiff(ArrayList<Integer> a, int n, int m) {
        Collections.sort(a); // Sort the array in ascending order
        long minDiff = Long.MAX_VALUE;

        // Slide the window of size 'm' through the sorted array
        for (int i = 0; i <= n - m; i++) {
            int maxChocolates = a.get(i + m - 1); // Maximum chocolates in the current window
            int minChocolates = a.get(i); // Minimum chocolates in the current window
            long diff = maxChocolates - minChocolates; // Difference for the current window
            minDiff = Math.min(minDiff, diff); // Update the minimum difference if needed
        }

        return minDiff;
    }
}
