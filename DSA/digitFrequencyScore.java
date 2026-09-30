class digitFrequencyScore {
    public int digitFrequencyScore(int n) {
        int[] arr=new int[10];
        while(n>0){
            int rem=n%10;
            arr[rem]++;
            n=n/10;
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans+(i*arr[i]);
        }
        return ans;
    }
}
