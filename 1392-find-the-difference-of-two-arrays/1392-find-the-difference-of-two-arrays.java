class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>set1=new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }for(int num:nums2){
            set1.add(num);
        }ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<List< Integer>>list3=new ArrayList<>();
        for(int num:nums1){
            if(!set1.contains(num)&&!list.contains(num)){
                list.add(num);
            }
        }for(int num:nums2){
            if(!set.contains(num)&&!list2.contains(num)){
           list2.add(num);}
        }list3.add(list);
        list3.add(list2);
        return list3;
    }
}