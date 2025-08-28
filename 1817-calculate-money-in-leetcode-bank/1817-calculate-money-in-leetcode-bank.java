class Solution {
    public int totalMoney(int n) {
        int count=0;
        int monday=1;
        int cur=1;
        for(int i=1;i<=n;i++){
            count+=cur;
        
        if(i%7==0){
            monday++;
            cur=monday;
            }else{
                cur++;
            }
            
            }return count;
            }
}