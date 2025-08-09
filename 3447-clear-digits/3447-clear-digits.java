class Solution {
    public String clearDigits(String s) {
       StringBuilder str=new StringBuilder();
       for(char ch:s.toCharArray()){
        if(Character.isDigit(ch)){
            if(str.length()>0){
                str.deleteCharAt(str.length()-1);
            }
        }else{
            str.append(ch);
        }
       }return str.toString();
    }
}