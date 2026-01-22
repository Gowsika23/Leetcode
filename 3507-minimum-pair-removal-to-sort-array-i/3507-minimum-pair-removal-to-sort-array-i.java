class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i:nums) list.add(i);
        int cnt=0;
        while(!sorted(list)){
            int idx=0;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<list.size()-1;i++){
                int sum=list.get(i)+list.get(i+1);
                if(sum<min){
                    min=sum;
                    idx=i;
                }
            }
            int merged = list.get(idx)+list.get(idx+1);
            list.set(idx,merged);
            list.remove(idx+1);
            cnt++;
        }
        return cnt;
    }

    private boolean sorted(List<Integer> list){
        for(int i=1;i<list.size();i++){
            if(list.get(i)<list.get(i-1)) return false;
        }
        return true;
    }
}