
class Solution {
    void pushZerosToEnd(int[] arr) {
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[j++]=arr[i];
              
            }
        }
        for(int i=j;i<arr.length;i++)
        arr[i]=0;
        
    }
}
