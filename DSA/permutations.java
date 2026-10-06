class Solution {
    static void solve(int[] input,List<List<Integer>> ans,List<Integer> output){
        //base case
        if(input.length==0){
            ans.add(new ArrayList(output));
            return;
        }
        //ek place par sare numbers ko rakho
        //baki recurssion dekh lega
        for(int i=0;i<input.length;i++){
            int[] rem = new int[input.length - 1];

            System.arraycopy(input,0,rem,0,i);
            System.arraycopy(input,i +1,rem,i,input.length - i - 1);
            output.add(input[i]);
            solve(rem,ans,output);
            output.remove(output.size()- 1); // backtrack
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        solve(nums,ans,output);
        return ans;
    }
}
