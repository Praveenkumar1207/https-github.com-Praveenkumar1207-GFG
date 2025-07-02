class Solution:
    def totalElements(self, arr):
        # Code here 
        d = {}
        ans = 1 
        st = 0
        for i in range(len(arr)):
            if arr[i] in d:
                d[arr[i]] += 1
            else:
                d[arr[i]] = 1
            while len(d) > 2:
                d[arr[st]] -= 1
                if(d[arr[st]] == 0):
                    del d[arr[st]]
                st += 1    
            ans = max(ans,i - st + 1) 
        return ans    
                    
                    
                
                 