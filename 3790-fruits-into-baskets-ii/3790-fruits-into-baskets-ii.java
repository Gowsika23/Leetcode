class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int sum=0;
        for(int f: fruits){
            int notTaken = 1;
            for(int i=0;i<baskets.length;i++){
                if(f <= baskets[i]){
                    baskets[i]=0;
                    notTaken =0;
                    break;
                }                
            }
            sum += notTaken;
        }
        return sum;
    }
}