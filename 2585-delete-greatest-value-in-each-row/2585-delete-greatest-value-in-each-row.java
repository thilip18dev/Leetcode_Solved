class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        for(int row[]:grid){
            Arrays.sort(row);
        }
        for(int i=0;i<m;i++){
            int max=0;
            for(int j=0;j<n;j++){
                 max=Math.max(max,grid[j][i]);
            }
            ans+=max;
        }return ans;
    }
}