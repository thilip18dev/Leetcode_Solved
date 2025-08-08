class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i=0;
        int j=0;
        for(String s:commands){
            char ch=s.charAt(0);
            if(ch=='R') j++;
            else if(ch=='L') j--;
            else if(ch=='U') i--;
            else i++;
             }return (i*n)+j;
    }
}