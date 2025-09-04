class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String a="";
        for(String num:words){
            a+=num;
        if(a.equals(s)){
            return true;
        }}return false;
    }
}