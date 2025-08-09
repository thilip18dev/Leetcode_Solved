class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        int n=details.length;
        for(String str:details){
        String s=""+str.charAt(11)+str.charAt(12);
        int a=Integer.parseInt(s);
        if(a>60){
            count++;
        }
        }return count;
    }
}