class Solution {
    public boolean judgeCircle(String moves) {
        int i=0;
        int j=0;
        for(char ch:moves.toCharArray()){
         if(ch=='U') i++;
         if(ch=='D') i--;
         if(ch=='R') j++;
         if(ch=='L') j--;
        }if(i==0&&j==0){
            return true;
        }return false;
    }
}