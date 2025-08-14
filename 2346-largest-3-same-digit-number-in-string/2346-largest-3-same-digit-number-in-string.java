class Solution {
    public String largestGoodInteger(String num) {
    for(char ch='9';ch>='0';ch--){
        String str=""+ch+ch+ch;
        if(num.contains(str)){
            return str;
        }
    }return "";
    }
}