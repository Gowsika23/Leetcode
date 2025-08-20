class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int ans =0;
        String str = "01";
        while(str.length() <= s.length()){
            if(s.contains(str)) ans = str.length();
            str = "0" + str + "1";
        }
        return ans;
    }
}