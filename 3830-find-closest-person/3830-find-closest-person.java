class Solution {
    public int findClosest(int x, int y, int z) {
        int a=Math.abs(z-x);
        int b=Math.abs(z-y);
        if(a<b){
            return 1;
        }if(b<a){
            return 2;
        }return 0;
    }
}