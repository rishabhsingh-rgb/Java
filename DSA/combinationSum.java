class Solution {
    static void solve(int[] candidates,int target,int index,List<List<Integer>> ans,List<Integer> output){
        //base case
        if(target==0){
            ans.add(new ArrayList<>(output));
            return;
        }
        if(index>candidates.length-1){
            return;
        }
        if(target<0){
            return;
        }

        //1 case solve karo
        int num=candidates[index];
        output.add(num);

        //include call
        solve(candidates,target-num,index,ans,output);
        //backtracking
        output.remove(output.size()-1);
        //exclude
        solve(candidates,target,index+1,ans,output);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        int index=0;
        solve(candidates,target,index,ans,output);
        return ans;
    }
}
