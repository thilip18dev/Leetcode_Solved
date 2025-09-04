class Solution {
    public int countPrefixes(String[] words, String s) {
        StringBuilder str=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++){
            str.append(s.charAt(i));
            for(int j=0;j<words.length;j++){
            if(str.toString().equals(words[j])){
                count++;
            }
            }
        }return count;
    }
}