class Solution {
    public int pivotInteger(int n) {
        int sumTillN=(n*(n+1))/2;
        for(int i=1;i<=n;i++){
            int sumTillPivot=(i*(i+1))/2;
            if(sumTillN-sumTillPivot+i==sumTillPivot){
                return i;
            }
        }
        return -1;
    }
}
