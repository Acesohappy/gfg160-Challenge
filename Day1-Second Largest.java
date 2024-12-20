class Solution {
    public int getSecondLargest(int[] arr) {
       int f=arr[0];
       int s=-1;
       if(arr.length<2)
       {
           return -1;
       }
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]>f)
           {
               s=f;
               f=arr[i];
           }
           else if(arr[i]>s && arr[i]!=f)
           {
               s=arr[i];
           }
       }
        return s;
    }
}
