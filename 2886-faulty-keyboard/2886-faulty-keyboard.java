class Solution {
    public String finalString(String s) {
        int n=s.length();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch!='i'){
                str.append(ch);
            }else{
             str.reverse();
            }
        }return str.toString();
    }
}