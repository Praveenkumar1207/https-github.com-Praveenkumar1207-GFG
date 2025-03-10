//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();

            Solution obj = new Solution();

            System.out.println(obj.countPS(s));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    public int solve(int x, int y, String s){
        if(s.charAt(x) != s.charAt(y)) return 0;
        int ans = 0;
        while(x >= 0 && y < s.length()){
            if(s.charAt(x) == s.charAt(y) ){
                if(x != y){
                    ans++;
                }
                x--;
                y++;
            }
            else{
                if(x - y == 0) return 0; 
                return ans;
            }
        }
        return ans;
    }
    public int countPS(String s) {
        // code here
        int ans= 0;
        for(int i = 0; i < s.length() - 1; i++){
            ans += solve(i,i,s);
            ans += solve(i,i + 1,s);
        }
        return ans;
    }
}