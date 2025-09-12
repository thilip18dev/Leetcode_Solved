class Solution {
    public boolean doesAliceWin(String s) {
        int vowels=0;
        for(char c:s.toCharArray()){
            if("aeiou".indexOf(c)!=-1){
                vowels++;
            }
        }if(vowels>0){
            return true;
        }return false;
    }
}