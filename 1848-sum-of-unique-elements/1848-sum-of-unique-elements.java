class Solution {
    public int sumOfUnique(int[] nums) {
     int sum=0;
     int n=nums.length;
     for(int i=0;i<n;i++){
        boolean s=true;
        for(int j=0;j<n;j++){
          if(i!=j&&nums[i]==nums[j]){
            s=false;
            break;
          }
        }if(s){
            sum+=nums[i];
        }
     }   return sum;
    }
}