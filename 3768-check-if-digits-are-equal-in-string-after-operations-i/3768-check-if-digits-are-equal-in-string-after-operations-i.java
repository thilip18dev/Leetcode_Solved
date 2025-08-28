class Solution {
    public boolean hasSameDigits(String s) {
        int n=s.length();
    while(s.length()>2){
         StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            int first=s.charAt(i)-'0';
            int secound=s.charAt(i+1)-'0';
            int digit=(first+secound)%10;
            str.append(digit);
        }
        s=str.toString();
    }return s.charAt(0)==s.charAt(1);
    }
}