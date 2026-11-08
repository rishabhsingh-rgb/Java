class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int num:nums){
            while(num>0){
                int digitWeGet=num%10;
                num=num/10;
                if(digit==digitWeGet){
                    count++;
                }
            }
        }
        return count;
    }
}
