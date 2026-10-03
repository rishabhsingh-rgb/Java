class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int num:candies){
            if(max<num){
                max=num;
            }
        }
        for(int candy:candies){
            if(candy+extraCandies>=max){
                l.add(true);
            }
            else{
                l.add(false);
            }
        }
        return l;
    }
}
