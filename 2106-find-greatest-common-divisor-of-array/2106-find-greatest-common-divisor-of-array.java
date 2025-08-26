class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[n-1];
        int res=0;
        for(int i=1;i<=max;i++){
            if(min%i==0&&max%i==0){
                res=Math.max(i,res);
            }
        }return res;
    }
}