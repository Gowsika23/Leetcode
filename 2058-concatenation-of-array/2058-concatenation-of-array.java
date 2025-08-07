class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[2*nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            res[k++] = nums[i];
        }
         for(int i=0;i<nums.length;i++){
            res[k++] = nums[i];
        }
        return res;
    }
}