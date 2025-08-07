class Solution {
    public int maximumWealth(int[][] acc) {
       int max = Integer.MIN_VALUE;
       for(int[] row : acc) {
        int sum=0;
            for(int i : row){
                sum+= i;
            }
            max = Math.max(max,sum);
       }
       return max;
    }
}