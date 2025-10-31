class Solution {
    public int maxSubArray(int[] nums) {
        int current=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
             current=nums[i]+current;
            current=Math.max(current,nums[i]);
            max=Math.max(max,current);
            
        }return max;
    }
}