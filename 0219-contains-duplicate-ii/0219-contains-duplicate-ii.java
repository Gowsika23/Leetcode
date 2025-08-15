class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int val = Math.abs(map.get(nums[i])-i);
                if(val<=k) return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}