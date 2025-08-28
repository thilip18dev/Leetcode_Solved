class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer>map=new HashMap<>();
        char[]arr=s.toCharArray();
        for(char ch:arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        Set<Integer>freq=new HashSet<>(map.values());
        return freq.size()==1;
    }
}