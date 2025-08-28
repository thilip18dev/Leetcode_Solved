class Solution {
    public int minTimeToType(String word) {
       int time=0;
       char curr='a';
       for(char tar:word.toCharArray()){
        int distance=Math.abs(tar-curr);
        int min=Math.min(distance,26-distance);
        time+=min+1;
        curr=tar;
       } return time;
    }
}