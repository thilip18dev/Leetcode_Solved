class Solution {
    public int sumBase(int n, int k) {
      int sum=0;
      while(n>0){
        int a=n%k;
        sum+=a;
        n=n/k;
      }  return sum;
    }
}