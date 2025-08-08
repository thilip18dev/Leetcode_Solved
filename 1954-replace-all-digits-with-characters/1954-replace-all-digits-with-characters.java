class Solution {
    public String replaceDigits(String s) {
        char arr[]=s.toCharArray();
        for(int i=1;i<arr.length;i+=2){
        char previous=arr[i-1];
        int num=arr[i]-'0';
        arr[i]=(char)(previous+num);
        }return new String(arr);
    }
}