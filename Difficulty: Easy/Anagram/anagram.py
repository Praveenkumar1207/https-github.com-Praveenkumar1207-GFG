#User function Template for python3


class Solution:
    def areAnagrams(self, s1, s2):
        if sorted(s1) == sorted(s2) and len(s1) == len(s2):
            return True
        else:
            return False

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for i in range(t):
        a = input().strip()
        b = input().strip()
        if (Solution().areAnagrams(a, b)):
            print("true")
        else:
            print("false")
        print("~")

# } Driver Code Ends