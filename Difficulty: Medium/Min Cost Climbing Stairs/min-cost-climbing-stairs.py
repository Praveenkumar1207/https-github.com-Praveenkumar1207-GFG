#Back-end complete function Template for Python 3

class Solution:
    def minCostClimbingStairs(self, cost):
        #Write your code here
        cost.append(0)
        dp = [0] * len(cost)
        for i in range(len(cost)):
            if i < 2:
                dp[i] = arr[i]
                continue
            
            dp[i] = min(arr[i] + dp[i-1], arr[i] + dp[i-2])
            
        return dp[-1]


#{ 
 # Driver Code Starts
t = int(input())
for _ in range(t):
    arr = list(map(int, input().split()))  # Input array
    obj = Solution()
    res = obj.minCostClimbingStairs(arr)
    print(res)
    print("~")

# } Driver Code Ends