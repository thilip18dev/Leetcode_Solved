class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
            int rev=0;
            while(num>0){
                rev=(rev*10)+(num%10);
                num=num/10;
            }set.add(rev);
        }return set.size();
    }
}