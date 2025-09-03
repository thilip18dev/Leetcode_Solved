class Solution {
    public int minPairSum(int[] nums) {
        int n=nums.length;
       int i=0;
       int j=n-1;
       Arrays.sort(nums);
       int max=0;
       while(i<j){
         max=Math.max(nums[i]+nums[j],max);
         i++;
         j--;
       }return max;

    }
}