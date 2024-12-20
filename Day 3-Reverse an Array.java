class Solution {
    public void reverseArray(int arr[]) {
        int f=0;
        int e=arr.length-1;
        for(int i=0;i<arr.length/2;i++)
        {
            int temp=arr[f];
            arr[f]=arr[e];
            arr[e]=temp;
            f++;
            e--;
        }
    }
}
