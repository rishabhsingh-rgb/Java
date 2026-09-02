public class missingElement {
    public static int missingNumber(int[] nums) {
        int n=nums.length;
        int xorSum=0;
        for(int num:nums){
            xorSum^=num;
        }
        for(int i=0;i<=n;i++){
            xorSum^=i;
        }
        return xorSum;
    }

    public static void main(String[] args) {
        int[] nums={1,0,4,6,3,2};
        System.out.println(missingNumber(nums));
    }
}
