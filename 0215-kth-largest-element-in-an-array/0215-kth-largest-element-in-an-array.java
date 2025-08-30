class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
       Arrays.sort(nums);
       return(nums[n-k]) ;
    }
}