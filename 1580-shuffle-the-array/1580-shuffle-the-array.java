class Solution {
    public int[] shuffle(int[] nums, int n) {
        int n2 = nums.length/2;int in=0;
        int[] res = new int[nums.length];
        for(int i=0;i<n;i++){
            res[in] = nums[i];
            in++;
            res[in] = nums[i+n];
            in++;
        }
        return res;
    }
}