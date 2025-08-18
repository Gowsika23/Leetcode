class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for(char c  : text.toCharArray()){
            freq[c-'a']++;
        }
        List<Integer> list = new ArrayList<>();  
        if(freq[0]>=1 && freq[1]>=1 && freq[11]>=2 && freq[13]>=1 && freq[14]>=2){    
            list.add(freq[0]);
            list.add(freq[1]);
            list.add(freq[11]/2);
            list.add(freq[13]);
            list.add(freq[14]/2);
            Collections.sort(list);
            return list.get(0); 
        }    
        return 0;
    }
}