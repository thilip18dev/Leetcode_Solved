class Solution {
    public int smallestEqual(int[] nums) {
        int min=0;
        for(int i=0;i<nums.length;i++){
         if(nums[i]==i%10){
            min=i;
            return min;
         }
        }return -1;
    }
}