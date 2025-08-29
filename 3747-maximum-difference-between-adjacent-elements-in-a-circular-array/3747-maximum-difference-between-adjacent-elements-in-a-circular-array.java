class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n=nums.length;
        int distance=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
       for(int i=0;i<n-1;i++){
           distance=Math.abs(nums[i]-nums[i+1]);
           max=Math.max(distance,max);
       }
       distance=Math.abs(nums[n-1]-nums[0]);
       max=Math.max(distance,max);
       return max;
    }
}