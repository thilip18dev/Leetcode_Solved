class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character>set=new HashSet<>();
        for(char ch:s.toCharArray()){
            if(set.contains(ch)){
                return ch;
            }set.add(ch);
        }return 'a';
    }
}