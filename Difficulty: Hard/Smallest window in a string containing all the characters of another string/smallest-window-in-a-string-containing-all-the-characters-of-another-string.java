//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		while(test > 0){
		    String s = scan.next();
		    String t = scan.next();
		    
		    System.out.println(new Solution().smallestWindow(s, t));
		    test--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p){
        // Your code here
        int[] freq = new int[26];
        int[] map = new int[26];
        for(char i:p.toCharArray()){
            freq[i - 'a']++;
        }
        
        int ans = Integer.MAX_VALUE;
        String res = "";
        int m = s.length();
        int required = p.length();
        int j = 0;
        
        for(int i = 0;i < m; i++){
            int c = s.charAt(i) - 'a';
            if(map[c] < freq[c]){
                required--;
            }
            map[c]++;
            
            while(required == 0){
                int curr = i - j +  1;
                int c2 = s.charAt(j) - 'a';
                
                if (curr < ans) {
                    ans = curr;
                    res = s.substring(j, i + 1);  
                }
                
                map[c2]--;
                if(map[c2] < freq[c2]){
                    required++;
                }
                j++;
            }
        }
        
        if(ans == Integer.MAX_VALUE) return "-1";
        return res;
        
    }
}