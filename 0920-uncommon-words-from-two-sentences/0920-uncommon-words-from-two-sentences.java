class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer>map=new HashMap<>();
        String arr1[]=s1.split(" ");
        String arr2[]=s2.split(" ");
        for(String num:arr1){
            map.put(num,map.getOrDefault(num,0)+1);
        }for(String num:arr2){
            map.put(num,map.getOrDefault(num,0)+1);
        }List<String>list=new ArrayList<>();
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
                list.add(entry.getKey());
            }
        }String res[]=new String[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }return res;
    }
}