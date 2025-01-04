//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            int target = Integer.parseInt(sc.nextLine());

            Solution ob = new Solution();
            int ans = ob.countTriplets(arr, target);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int countTriplets(int[] arr, int target) {
        // Code Here
        int ans = 0;
        
        for(int i = 0;i < arr.length - 2; i++){
            int j = i + 1;
            int k = arr.length - 1;
            while(j < k){
                
                int sum = arr[i] + arr[j] + arr[k];
                int dj = j;
                int dk = k;
                if(sum == target){
                    ans += 1;
                    // System.out.println(i + " " + j + " " + k);
                    while(dj + 1 < k && arr[dj] == arr[dj + 1]){
                        dj++;
                        ans += 1;
                        // System.out.println(i + " " + dj + " " + k);
                    }
                    
                    while(dk - 1 > j && arr[k] == arr[dk - 1]){
                        dk--;
                        ans += 1;
                        // System.out.println(i + " " + j + " " + dk);
                    }
                    j++;
                    k--;
                }
                else if(sum > target){
                   k--;
                }
                else{
                    j++;
                }
            }
        }
        return ans;
    }
}