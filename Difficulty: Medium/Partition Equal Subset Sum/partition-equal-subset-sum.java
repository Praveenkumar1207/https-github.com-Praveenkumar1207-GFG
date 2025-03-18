//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Solution ob = new Solution();

            if (ob.equalPartition(arr))
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    static boolean solve(int[] nums, int i, int n, int sum, Boolean[][] dp){
        if(sum == 0){
            return true;
        }
        
        if(sum < 0 || i >= n){
            return false;
        }

        if(dp[i ][sum] != null){
            return dp[i][sum];
        }
        
        if(nums[i] > sum){
            return dp[i][sum] = solve(nums, i + 1, n, sum,dp);
        }

        dp[i][sum] = solve(nums, i + 1 , n, sum, dp) || solve(nums, i + 1 , n, sum - nums[i], dp);

        return dp[i][sum]; 
    }
    
    static boolean equalPartition(int nums[]) {
        // code here
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        int n = nums.length;
       
        Boolean[][] dp = new Boolean[n + 1][sum/2 + 1];
        
        if(sum % 2 == 1){
            return false;
        }

        return solve(nums, 0, n, sum/2, dp);
    }
}