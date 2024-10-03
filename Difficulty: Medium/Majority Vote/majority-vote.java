//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            List<Integer> nums = new ArrayList<>();
            for (String part : parts) {
                nums.add(Integer.parseInt(part));
            }
            Solution ob = new Solution();
            List<Integer> ans = ob.findMajority(nums);
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
// } Driver Code Ends




class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> res = new ArrayList<>();


        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int threshold = nums.size() / 3;

        for(int i= 0;i < nums.size();i++){
            if(freqMap.get(nums.get(i)) > threshold){
                res.add(nums.get(i));
                freqMap.put(nums.get(i),0);
            }
        }
        if (res.isEmpty()) {
            res.add(-1);
        }
        
        return res;
    }
}
