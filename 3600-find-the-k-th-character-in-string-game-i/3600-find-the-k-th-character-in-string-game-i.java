class Solution {
    public char kthCharacter(int k) {
       String word="a";
        while(k>word.length()){
             StringBuilder s=new StringBuilder();
            for(char ch:word.toCharArray()){
                if(ch=='z'){
                    s.append('a');
                }else{
                    s.append((char)(ch+1));
                }
            } word=word+s.toString();

        }return word.charAt(k-1);
    }
}