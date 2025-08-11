class Solution {
    public boolean isBalanced(String num) {
      char arr[]=num.toCharArray();
      int sum=0;
      int sum1=0;
      for(int i=0;i<arr.length;i++){
        if(i%2==0){
            sum+=arr[i]-'0';
        }else{
            sum1+=arr[i]-'0';
        }
        }
        if(sum==sum1){
            return true;
        }
      return false;
    }
}