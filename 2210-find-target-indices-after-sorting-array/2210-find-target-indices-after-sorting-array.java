class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n=nums.length;
        List<Integer>list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
        if(nums[i]==target){
            list.add(i);
        }
        }return list;
    }
}