#User function Template for python3
class Solution:

	
	def search(self,arr, n, k): 
    	# code here
    	for i in range(0,n):
    	    if (arr[i] == k):
    	        return i+1
    	else:
    	    return -1
    	            



#{ 
 # Driver Code Starts
#Initial Template for Python 3


# Driver code 
if __name__ == "__main__": 		
    tc=int(input())
    while tc > 0:
        n, k=map(int, input().strip().split())
        arr=list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.search(arr, n, k)
        print(ans)
        tc=tc-1
# } Driver Code Ends