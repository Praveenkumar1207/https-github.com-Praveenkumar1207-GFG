class Solution {
    public int minSoldiers(int[] arr, int k) {
        // code here
        int count = 0;
        for(int i = 0;i < arr.length; i++){
            arr[i] = arr[i] %k;
            if(arr[i] == 0){
                // System.out.println(i + " " + arr[i] );
                count++; 
            }
        }
        Arrays.sort(arr);
        int index = arr.length - 1;
        int ans = 0;
        // System.out.println("present count:" + count + " " +  (int) Math.ceil(arr.length / 2.0) );
        while(count < (int) Math.ceil(arr.length / 2.0)){ 
            ans += k - arr[index];
            index--;
            count++;
        } 
        return ans; 
    }
}