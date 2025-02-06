//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().matrixMultiplication(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int solve(int[] arr,int i, int n,int[][] dp){
        if(i == n - 1){
            return 0;
        }
        if(dp[i][n] != -1){
            return dp[i][n];
        }
        int res = Integer.MAX_VALUE;
        
        for(int j = i + 1; j < n; j++){
            int curr = solve(arr,i,j,dp) + solve(arr,j,n,dp) + arr[i] * arr[j] * arr[n];
            
            res = Math.min(res,curr);
        }
        dp[i][n] = res;
        return dp[i][n];
    }
    static int matrixMultiplication(int arr[]) {
        // code here
        int n = arr.length;
    
        int[][] dp = new int[n][n];
        for(int[] i: dp){
            Arrays.fill(i,-1);
        }
        
        return solve(arr,0,arr.length - 1,dp);
    }
}