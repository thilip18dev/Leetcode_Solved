class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            boolean a=false;
            for(int j=i+1;j<n;j++){
                if(prices[i]>=prices[j]){
                    arr[i]=prices[i]-prices[j];
                    a=true;
                    break;
                }
            }if(!a){
                arr[i]=prices[i];
            }
        }return arr;
    }
}