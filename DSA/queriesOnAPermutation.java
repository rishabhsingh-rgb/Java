class Solution {
    public int[] processQueries(int[] queries, int m) {
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=1;i<=m;i++){
            list.addLast(i);
        }
        int n=queries.length;
        int[] ans=new int[n];
        int index=0;
        for(int query:queries){
            ans[index]=list.indexOf(query);
            index++;
            list.remove(Integer.valueOf(query));
            list.addFirst(query);
        }
        return ans;
    }
}
