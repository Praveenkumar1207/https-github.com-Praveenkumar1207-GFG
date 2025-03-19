//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {

            String input_line[] = read.readLine().trim().split("\\s+");
            int N = input_line.length;
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if (ob.isSubsetSum(arr, sum))
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
    static Boolean isSubsetSum(int nums[], int sum) {
        // code here
        int n = nums.length;
        Boolean[][] dp = new Boolean[n + 1][sum+ 1];
        return solve(nums, 0, n, sum, dp);
    }
}