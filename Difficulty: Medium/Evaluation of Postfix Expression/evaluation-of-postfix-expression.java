//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;


// } Driver Code Ends


class Solution {
    public int solve(int a, int b, char c){
        if(c=='+'){
            return a+b;
        }
        if(c=='-'){
            return a-b;
        }
        if(c=='*'){
            return a*b;
        } 
        if(c=='/'){
        
            return a/b;
        }
        return a;
    }
    public int evaluate(String[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i  < arr.length; i++){
            if("+-*/".contains(arr[i])){
               
                int a = st.pop();
                int b = st.pop();
                                
                int res = solve(b,a,arr[i].charAt(0));
                st.push(res);
            }
            else{
                st.push((Integer.parseInt(arr[i])));
            }
            
        }
        return st.pop();
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int t = Integer.parseInt(line);
        while (t-- > 0) {
            line = reader.readLine();
            String[] arr = line.split(" ");
            Solution solution = new Solution();
            System.out.println(solution.evaluate(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends