class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        int xor=0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==2){
            xor^=entry.getKey();
            }
        }return xor;
        
    }
}