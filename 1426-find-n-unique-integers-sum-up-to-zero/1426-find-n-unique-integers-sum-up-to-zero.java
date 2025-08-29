class Solution {
    public int[] sumZero(int n) {
        int result[]=new int[n];
        int index=0;
        int current=1;
        while(index<n/2){
            result[index*2]=current;
            result[index*2+1]=-current;
            index++;
            current++;
        }if(n%2!=0){
            result[n-1]=0;
        }return result;
    }
}