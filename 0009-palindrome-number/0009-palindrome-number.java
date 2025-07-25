class Solution {
    public boolean isPalindrome(int x) {
        String val1 = String.valueOf(x);
        StringBuilder sb = new StringBuilder(val1);        
        String val2 = sb.reverse().toString();
        if(val1.equals(val2)) return true;
        return false;
    }
}