class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(char word : word1.toCharArray()) freq1[word-'a']++;
        for(char word: word2.toCharArray()) freq2[word-'a']++;

        for(int i=0;i<26;i++){
            int val = Math.abs(freq1[i] - freq2[i]);
            if(val>3) return false;
        }
        return true;        
    }
}