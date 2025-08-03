class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        if(s.length()==1) return 1;

        int max=0, left=0, right=0;

        Set<Character> set = new HashSet<>();
        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
               set.add(s.charAt(right));
               right++;
               max = Math.max(max, set.size());
            }
            else {
                set.remove(s.charAt(left));  
                left++;
            }

        }
        return max;
    }
}