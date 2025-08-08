class Solution {
    public int[] buildArray(int[] nums) {
        int[] ind = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ind[i] = nums[nums[i]];
        }
        int[] res = new int[nums.length];
        for(int i=0;i<ind.length;i++){
            res[i] = ind[i];
        }
        return res;
    }
}