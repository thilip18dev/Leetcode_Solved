class Solution {
    public int countTestedDevices(int[] arr) {
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                count++;
            for(int j=i+1;j<n;j++){
              arr[j]=arr[j]-1;
            }}
        }return count;
    }
}