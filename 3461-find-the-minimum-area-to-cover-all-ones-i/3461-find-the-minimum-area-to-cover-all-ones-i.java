class Solution {
    public int minimumArea(int[][] grid) {
        int rmin = Integer.MAX_VALUE;
        int cmin = Integer.MAX_VALUE;
        int rmax = Integer.MIN_VALUE;
        int cmax = Integer.MIN_VALUE;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1) {
                    rmin = Math.min(rmin,i);
                    cmin = Math.min(cmin,j);
                    rmax = Math.max(rmax,i);
                    cmax = Math.max(cmax,j);
                }
            }
        }
        int ans = (rmax-rmin+1) * (cmax-cmin+1);
        return ans;

    }
}