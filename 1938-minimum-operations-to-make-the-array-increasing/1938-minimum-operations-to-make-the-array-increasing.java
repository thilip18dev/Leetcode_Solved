class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int count=0;
       for(int i=1;i<n;i++){
        if(nums[i]<=nums[i-1]){
            int diff=nums[i-1]-nums[i]+1;
            nums[i]+=diff;
            count+=diff;
        }
       } return count;
    }
}