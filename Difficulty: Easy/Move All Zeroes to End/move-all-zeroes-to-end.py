#User function Template for python3

class Solution:
	def pushZerosToEnd(self,arr):
    	# code here
        l = []
        n = len(arr)
        for i in arr:
            if i != 0:
                l.append(i)
        while len(l) < len(arr):
            l.append(0)
        for i in range(len(arr)):
            arr[i] = l[i]

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ob.pushZerosToEnd(arr)
        for x in arr:
            print(x, end=" ")
        print()
        tc -= 1
# } Driver Code Ends