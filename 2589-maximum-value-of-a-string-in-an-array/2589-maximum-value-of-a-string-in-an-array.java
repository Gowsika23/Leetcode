class Solution {
    public int maximumValue(String[] strs) {
        int max = Integer.MIN_VALUE;
        for(String w : strs){
            int v=0;
            if(w.matches("\\d+")) v = Integer.parseInt(w);
            else v = w.length();
            max = Math.max(max,v);
        }
        return max;
    }
}