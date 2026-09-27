//leetcode 771
class jewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set=new HashSet<>();
        for(char ch:jewels.toCharArray()){
            set.add(ch);
        }
        int ans=0;
        for(char ch:stones.toCharArray()){
            if(set.contains(ch)){
                ans++;
            }
        }
        return ans;
    }
}
