class Solution {
    public String generateTheString(int n) {
        StringBuilder str=new StringBuilder();
        if(n%2==0){
            for(int i=0;i<n-1;i++){
           str.append('a');
        }}if(n%2==0){
            str.append('b');
        }if(n%2!=0){
            for(int i=0;i<n;i++){
                str.append('a');
            }
        }
        return str.toString();
    }
    }
