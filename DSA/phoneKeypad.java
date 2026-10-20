class Solution {
static void solve(String digits,int index,String[] mapping,List<String> result,StringBuilder output){
    //base case-> jaise hi index input string ke bahar nikal jayega
    if(index>= digits.length()){
        result.add(output.toString());
        return;
    }
    //1 case mai solve karunga baki recursion
    int value=digits.charAt(index)-'0';
    String mappedString =mapping[value];
    //current value ans uski mapped string mere pass ready hai
    //current block pr use rakhdete hai and baki recursion
    for(int i=0;i<mappedString.length();i++){
        output.append(mappedString.charAt(i));
        solve(digits,index+1,mapping,result,output);
        //backtracking
        output.deleteCharAt(output.length()-1);
    }

}
    public List<String> letterCombinations(String digits) {
        String[] mapping ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result=new ArrayList<>();
        int index=0;
        StringBuilder output=new StringBuilder();
        solve(digits,index,mapping,result,output);
        return result;
    }
}
