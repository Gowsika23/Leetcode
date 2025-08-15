class Solution {
    public String longestNiceSubstring(String s) {
        int max =0;
        String ans = "";
        for(int i=0;i< s.length();i++){
            for(int j=i+max+1;j<=s.length();j++){
                String str = s.substring(i,j);
               if(isNice(str)){
                  if(str.length() > max){
                    max = str.length();
                    ans = str;
                }
            }
        }
        }
        return ans;
    }

    public static boolean isNice(String str){
        for(char c = 'a';c<='z';c++){
            char up = Character.toUpperCase(c);
            char low = Character.toLowerCase(c);
            if(str.indexOf(up)!=-1 && str.indexOf(c)==-1 ||
            str.indexOf(up)==-1 && str.indexOf(c)!=-1) return false;
        }
        return true;
    }
}