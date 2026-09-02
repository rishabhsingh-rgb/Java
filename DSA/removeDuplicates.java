//leetcode 26
class removeDuplicates{
    public static int removeDuplicate(int[] nums) {
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,3,4,4,4,5};
        System.out.println(removeDuplicate(arr));
    }
}
