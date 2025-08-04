class Solution {
    public int totalFruit(int[] fruits) {
        int st=0, end=0;
        int n = fruits.length;
        int max=0;
        Map<Integer, Integer> mp = new HashMap<>();
        while(end<n){
            mp.put(fruits[end],mp.getOrDefault(fruits[end],0)+1);
            while(mp.size()>=3){
                mp.put(fruits[st],mp.get(fruits[st])-1);
                if(mp.get(fruits[st])==0) mp.remove(fruits[st]);
                st++;
            }
            int len = end-st+1;
            max = Math.max(max,len);
            end++;
        }
        return max;
    }
}