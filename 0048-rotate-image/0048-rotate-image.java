class Solution {
    public void rotate(int[][] mat) {
        int n = mat.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for(int i=0;i<n;i++){
            int st=0, end = n-1;
            while(st<end){
                int temp = mat[i][st];
                mat[i][st] = mat[i][end];
                mat[i][end] = temp;
                st++;
                end--;
            }
        }
    }
}