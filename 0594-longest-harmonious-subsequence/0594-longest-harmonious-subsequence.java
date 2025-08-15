class Solution {
    public int findLHS(int[] nums) {
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) map.put(i, map.getOrDefault(i,0)+1);
        for(int key : map.keySet()){
            if(map.containsKey(key+1)){
                int len = map.get(key) + map.get(key+1);
                if(len>max) max = len;
            }
        }
        return max;
    }
}