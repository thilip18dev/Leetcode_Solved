class Solution {
    public String removeTrailingZeros(String num) {
        int n=num.length();
        StringBuilder str=new StringBuilder();
        str.append(num);
        for(int i=n-1;i>=0;i--){
            if(str.charAt(i)=='0'){
                str.deleteCharAt(i);
            }else{
                break;
            }
        }return str.toString();
    }
}