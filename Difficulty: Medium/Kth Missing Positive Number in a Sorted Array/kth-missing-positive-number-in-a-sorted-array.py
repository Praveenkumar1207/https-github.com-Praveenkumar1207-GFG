#User function Template for python3
class Solution:
    def kthMissing(self, arr, k):
        # code here
        i = 1
        currk = 0
        val = 1
        d = {}
        for i in arr:
            if i in d:
                d[i] += 1
            else:
                d[i] = 1
        while currk < k:
            if val in d:
                val += 1
                continue
            else:
                val += 1
                currk += 1
        return val - 1
#{ 
 # Driver Code Starts
#Initial Template for Python 3

#Main
if __name__ == '__main__':
    t = int(input())
    while t:
        t -= 1
        A = [int(x) for x in input().strip().split()]
        nd = [int(x) for x in input().strip().split()]
        D = nd[0]
        ob = Solution()
        ans = ob.kthMissing(A, D)
        print(ans)
        print("~")

# } Driver Code Ends