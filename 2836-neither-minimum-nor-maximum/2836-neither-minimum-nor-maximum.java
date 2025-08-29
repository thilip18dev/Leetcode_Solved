class Solution {
    public int findNonMinOrMax(int[] nums) {
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
        mini=Math.min(nums[i],mini);
         maxi=Math.max(nums[i],maxi);
        }for(int i=0;i<n;i++){
            if(nums[i]!=mini && nums[i]!=maxi){
                return nums[i];
                
            }
        }return -1;
    }
}