class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                list.add(nums[i]);
            }else{
                ArrayList<Integer>list1=new ArrayList<>();
                int a=nums[i];
                int rem=0;
                while(a>0){
                rem=a%10;
                list1.add(rem);
                a=a/10;
                 }
                 for(int j=list1.size()-1;j>=0;j--){
                    list.add(list1.get(j));
                 }
            }
        }int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
        arr[i]=list.get(i);
        }return arr;
    }
}