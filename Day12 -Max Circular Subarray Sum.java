class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {
        int total = 0;    
        int currMax = 0, currMin = 0;
        int maxSum = arr[0], minSum = arr[0];
        
        for(int i = 0; i < arr.length; i++) {
            currMax = Math.max(currMax + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currMax); 
          
            currMin = Math.min(currMin + arr[i], arr[i]);
            minSum = Math.min(minSum, currMin);

            total += arr[i];
        }
        
        int normalSum = maxSum;
        int circularSum = total - minSum;

        if(minSum == total)
            return normalSum;
        
        return Math.max(normalSum, circularSum);

    }
}
