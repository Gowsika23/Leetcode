class Solution {
    public String reverseStr(String s, int k) {
         char[] ch = s.toCharArray();         

         StringBuilder ans = new StringBuilder();
         int i=0;

           while(i<s.length()){
            int j= Math.min(i+2*k, s.length());
                String first = s.substring(i,j);
                int f = Math.min(k, first.length());
                String temp = first.substring(0,f);
                StringBuilder c = new StringBuilder(temp);
                String temp1 = c.reverse().toString();
                String temp2 = first.substring(f);
                String vari = temp1 + temp2;
                ans.append(vari);
                i+=2*k;
                //j= j+j;
         }
         return ans.toString();
        
        // while(j<s.length()){
        //     int len = j-i+1;
        //     if(len>=k && len<= j){
        //         for(int m=i;m<k;m++){
        //             char temp = m[i];
        //             m[i] = m[i+1];
        //             m[]
        //         }
        //     }
        // }
        
    }
}