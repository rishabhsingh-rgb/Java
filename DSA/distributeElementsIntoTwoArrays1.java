class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        int i=0;
        int j=1;
        list.add(nums[0]);
        list.add(nums[1]);
        for(int k=2;k<n;k++){
            if(list.get(i)>list.get(j)){
                i++;
                list.add(i,nums[k]);
                j++;
            }
            else{
                j++;
                list.add(j,nums[k]);
            }
        }
        for(int m=0;m<n;m++){
            nums[m]=list.get(m);
        }
        return nums;
    }
}
