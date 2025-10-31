class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        List<Integer>list=new ArrayList<>();
        for(int num:nums){
            if(!set.add(num)){
                list.add(num);
            }
        }int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }return arr;
    }
}