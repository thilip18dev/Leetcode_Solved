class Solution {
    public int[] minCosts(int[] cost) {
        int n=cost.length;
        for(int i=0;i<n-1;i++){
         cost[i+1]=Math.min(cost[i],cost[i+1]);
        }return cost;
    }
}