class Solution {
    static void getAllSubsequence(int[] nums,List<Integer> output,List<List<Integer>> res,int index){
        if(index>=nums.length){
            res.add(new ArrayList<>(output));
            return;
        }
        
        //include and exclude call
        output.add(nums[index]);
        getAllSubsequence(nums,output,res,index+1);

        //backtracking
        output.remove(output.size()-1);

        while(index+1<nums.length && nums[index]==nums[index+1]){
            index++;
        }
        getAllSubsequence(nums,output,res,index+1);
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        int index=0;
        
        //recurssive method
        getAllSubsequence(nums,output,res,index);
        return res;
    }
}
