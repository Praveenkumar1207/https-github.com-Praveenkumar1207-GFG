#User function Template for python3

class Solution:
    def maxSum(self,arr):
        # code here
        l = 0
        r = len(arr) - 1
        dum = []
        arr.sort()
        while l <= r:
            if l == r:
                dum.append(arr[l])
            else:
                dum.append(arr[l])
                dum.append(arr[r])
            l += 1
            r -= 1
        ans = 0
        for i in range(len(arr) - 1):
            ans += abs(dum[i] - dum[i + 1])
        ans += abs(dum[0] - dum[len(dum) - 1])
        return ans

#{ 
 # Driver Code Starts
#Initial Template for Python 3


def main():
    t = int(input())
    for _ in range(t):
        arr = list(map(int, input().split()))
        ob = Solution()
        ans = ob.maxSum(arr)  # Call maxSum method and store result in ans
        print(ans)  # Print the result
        print("~")


if __name__ == "__main__":
    main()

# } Driver Code Ends