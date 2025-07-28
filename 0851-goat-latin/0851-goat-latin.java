class Solution {
    public String toGoatLatin(String sentence) {
        String str = "maa";
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            char c = word.charAt(0);
            if(isVowel(c)) sb.append(word+str).append(" ");
            else {
                String first = word.substring(1);
                String second = word.substring(0,1);
                String ans = first + second +str;
                sb.append(ans).append(" ");
            }
            str+="a";
        }
        return sb.toString().trim();
    }

    public static boolean isVowel(char c){
        if("aeiouAEIOU".indexOf(c)!=-1) return true;
        return false;
    }
}