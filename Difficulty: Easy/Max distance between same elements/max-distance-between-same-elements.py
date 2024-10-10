class Solution:
    # Your task is to Complete this function
    # functtion should return an integer
    def maxDistance(self, arr):
        # Code here
        d = {}
        ans = 0
        for i in range(len(arr)):
            if arr[i] not in d:
                d[arr[i]] = i
            else:
               ans = max(ans,i - d[arr[i]])
        return ans


#{ 
 # Driver Code Starts
if __name__ == "__main__":
    t = int(input())
    for _ in range(t):
        arr = list(map(int, input().split()))
        ob = Solution()
        print(ob.maxDistance(arr))

# } Driver Code Ends