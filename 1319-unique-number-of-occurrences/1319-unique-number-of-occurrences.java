class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer>map=new HashMap<>();
        List<Integer>list=new ArrayList();
        for(int num:arr){
            map.put(num,(map.getOrDefault(num,0)+1));
        }for(int num:map.values()){
            if(!list.contains(num)){
                list.add(num);
            }else{
                return false;
            }
        }return true;
    }
}