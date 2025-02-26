//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    public static int solve(int[] res, int n, int x){
        int carry = 0;
        for(int i = 0;i < n; i++){
            int dum = res[i] * x + carry;
            res[i] = dum%10;
            carry = dum / 10;
        }
        
        while(carry != 0){
            res[n] = carry%10;
            n++;
            carry = carry/10;
        }
        return n;
    }
    public static ArrayList<Integer> factorial(int n) {
        // code here
        int[] res = new int[10000];
        
        int size = 1;
        res[0] = 1;
        for(int i = 2; i <= n; i++){
             size = solve(res,size,i);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = size - 1; i >= 0; i--){
              arr.add(res[i]);
        }
        return arr;
    }
}


//{ Driver Code Starts.

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends