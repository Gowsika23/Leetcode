class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        if(s.length()==2 && s.charAt(0)!=s.charAt(1)) return String.valueOf(s.charAt(0));
        String ans = "";
        int max=0;
        int st =0, end=0;
        for(int i = s.length()-1;i>=0;i--){
            for(int j=0;j<i;j++){
              int len = i-j+1;
                if(isPalin(s,j,i)){
                    if(len>max) {
                        max = len;
                        st = j;
                        end = i;
                }
            }
        }
        }
        return s.substring(st,end+1);
    }

        public static boolean isPalin(String s,int st, int end){
            for(int i=st;i<=end;i++){
                if(s.charAt(i)!= s.charAt(end)) return false;
                st++;
                end--;
            }
            return true;
        }
    }
