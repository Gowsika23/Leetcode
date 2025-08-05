class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        Set<Character> set = new HashSet<>();
        int st=0, end=0;
        while(end < s.length()){
            if(!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                max = Math.max(max, set.size());
                end++;
            }
            else {           
              set.remove(s.charAt(st));
              st++;
            }
        }
        return max;
    }
}