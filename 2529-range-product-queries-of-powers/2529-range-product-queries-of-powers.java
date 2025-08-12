class Solution {
    public int[] productQueries(int n, int[][] q) {
        List<Integer> list=new ArrayList<>();
         int mod=(int)1e9+7;
        for(int i=0;i<31;i++){
            if((n>> i & 1) == 1) list.add(1 << i);
        }
        int[] ans=new int[q.length];
        for(int i=0;i<q.length;i++){
            long prod=1;
            for(int j=q[i][0];j<=q[i][1];j++){
                prod=(prod*list.get(j))%mod;
            }
            ans[i]=(int)prod;
        }
        return ans;
    }
}