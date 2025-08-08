class Solution {
    public int numberOfMatches(int n) {
        int c=0;
        while(n>1){
            int val =n/2;
            if(n%2!=0) n= val+1;                
            else n = val;
            c+= val;
        }
        return c;
    }
}