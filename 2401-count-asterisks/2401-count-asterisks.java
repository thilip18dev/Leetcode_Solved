class Solution {
    public int countAsterisks(String s) {
        int sum=0;
        int sum2=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='|'){
                sum++;
            }if(sum%2==0&&ch=='*'){
                sum2++;
            }
        }return sum2;
    }
}