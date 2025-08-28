class Solution {
    public int minimumChairs(String s) {
       int count=0;
       int max=0;
       int n=s.length();
       for(int i=0;i<n;i++){
        if(s.charAt(i)=='E'){
          count++;
        }else{
            count--;
        }max=Math.max(max,count);
       }return max;
    }
}