class Solution {
    public int findPoisonedDuration(int[] time, int dura) {
       if(time.length ==0 || dura==0) return 0;
       int ans=0;
       for(int i=0;i<time.length-1;i++){
          ans += Math.min((time[i+1]-time[i]),dura);
       }
       return ans+dura;
    }
}