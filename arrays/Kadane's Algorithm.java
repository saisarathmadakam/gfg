class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int maxending=arr[0];
        int res =arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            
         maxending = Math.max(maxending+arr[i],arr[i]);
         
         res=Math.max(res,maxending);
        }
        return res;
    }
}
