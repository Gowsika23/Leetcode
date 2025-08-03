class Solution {
    public int reverse(int x) {
        String s = String.valueOf(Math.abs(x));
        StringBuilder sb = new StringBuilder(s).reverse();
        int ans =0;
        try{
            ans = Integer.parseInt(sb.toString());
        }
        catch(NumberFormatException e){
            return 0;
        }
        if(x<0){
            return -ans;
        }
        return ans;
    }
}