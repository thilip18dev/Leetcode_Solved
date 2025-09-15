class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                return i;
            }

        }
    return -1;
        
    }
}