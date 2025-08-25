class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int n=i;
            boolean a=true;
            while(n>0){
                int rem=n%10;
                if(rem==0||i%rem!=0){
                    a=false;
                    break;
                }
                n=n/10;
            }if(a){
                list.add(i);
            }
        }return list;
    }
}