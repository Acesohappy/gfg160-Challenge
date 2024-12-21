class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {
        int n=arr.length;
        
        int max=arr[0];
        int res=arr[0];
        
        for(int i=1;i<n;i++)
        {
            if(arr[i]>(max+arr[i]))
            max=arr[i];
            else
            max=max+arr[i];
            
            if(max>res)
            res=max;
        }
        return res;
    }
}
