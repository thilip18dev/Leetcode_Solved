class Solution {
    public String concatHex36(int n) {
        String ans=Integer.toHexString(n*n).toUpperCase();
        String ans1=Integer.toString(n*n*n,36).toUpperCase();
        return(ans+ans1);
    }
}