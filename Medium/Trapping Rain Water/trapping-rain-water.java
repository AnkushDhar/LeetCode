//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int height[], int n) { 
        // Your code here
        int [] leftMax = new int[height.length];
        leftMax[0] = height[0];
        for (int i=1; i< height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        int [] rightMax = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i= height.length-2; i>= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        long trappedWater = 0;
        for (int i=0; i< height.length; i++){
            long waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    } 
}


