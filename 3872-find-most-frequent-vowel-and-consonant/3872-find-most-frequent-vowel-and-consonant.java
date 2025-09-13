class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer>map=new HashMap<>();
        int max1=0;
        int max2=0;
        for(char d:s.toCharArray()){
            map.put(d,map.getOrDefault(d,0)+1);
        }for(Map.Entry<Character,Integer>entry:map.entrySet()){
            if(entry.getKey()=='a'||entry.getKey()=='e'||entry.getKey()=='i'||entry.getKey()=='o'||entry.getKey()=='u'){
                max1=Math.max(max1,entry.getValue());
            }else{
                max2=Math.max(max2,entry.getValue());
            }
        }return max1+max2;
    }
}