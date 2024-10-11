#{ 
 # Driver Code Starts

# } Driver Code Ends
class Solution:
    def rearrange(self, arr):
        #Code here
        d = {}
        for i in arr:
            d[i] = 1
        l = []
        for i in range(len(arr)):
            if i in d:
                l.append(i)
            else:
                l.append(-1)
        return l

#{ 
 # Driver Code Starts.
def main():
    t = int(input())
    for _ in range(t):
        input_str = input()
        arr = list(map(int, input_str.split()))
        solution = Solution()
        ans = solution.rearrange(arr)
        print(" ".join(map(str, ans)))

if __name__ == "__main__":
    main()
# } Driver Code Ends