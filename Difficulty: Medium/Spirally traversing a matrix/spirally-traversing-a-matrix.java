//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            int matrix[][] = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends




class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int matrix[][]) {
        // code here
        int rs = 0;
        int re = matrix.length - 1;
        int cs = 0;
        int ce = matrix[0].length-1;
        int c = 0;
        int tot = matrix.length*matrix[0].length;
        ArrayList<Integer> ans =  new ArrayList<>();
        while(c < tot){
            for(int i = cs; rs <= re &&cs <= ce && i <= ce;i++){
                ans.add(matrix[rs][i]);
                // System.out.print(")" + " ");
                c++;
            }
            if(c >= tot) break;
            rs++;
            for(int i = rs; rs <= re &&cs <= ce && i <= re;i++){
                ans.add(matrix[i][ce]);
                //  System.out.print("*" + " ");
                c++;
            }
            
            if(c >= tot) break;
            ce--;
            for(int i = ce ; rs <= re &&cs <= ce && i >= cs; i--){
                ans.add(matrix[re][i]);
                //  System.out.print("&" + " ");
                c++;
            }
            
            if(c >= tot) break;
            re--;
            for(int i = re;rs <= re &&cs <= ce && i>= rs;i--){
                ans.add(matrix[i][cs]);
                //  System.out.print("h" + " ");
                c++;
            }
            
            if(c >= tot) break;
            cs++;
        }
        return ans;
    }
}
