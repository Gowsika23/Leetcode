class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extra) {
        int max = Integer.MIN_VALUE;
        for(int i : candies) max = Math.max(max,i);
        List<Boolean> list = new ArrayList<>();
        for(int i : candies) list.add(i+extra >=max);
        return list;
    }
}