class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int arr[]=new int[n];
        int seenA[]=new int[n+1];
        int common=0;
        for(int i=0;i<n;i++){
            if(++seenA[A[i]]==2){
                common++;
            } if(++seenA[B[i]]==2){
                common++;
            }
            arr[i]=common;
        }return arr;
    }
}