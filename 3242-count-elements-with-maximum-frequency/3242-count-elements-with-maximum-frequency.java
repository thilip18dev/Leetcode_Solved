class Solution {
    public int maxFrequencyElements(int[] nums) {
       int count=0;
       Map<Integer,Integer>map=new HashMap<>();
       for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
        
       } int max=0;
       for(int num:map.values()){
        max=Math.max(max,num);
       }for(int num:map.values()){
        if(num==max){
            count++;
        }
       }return count*max;
    }
}