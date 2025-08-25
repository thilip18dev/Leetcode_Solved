class Solution {
    public boolean divideArray(int[] nums) {
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
       } for(Map.Entry<Integer,Integer>entry:map.entrySet()){
        if(entry.getValue()%2!=0){
            return false;
        }
       }return true;
    }
}