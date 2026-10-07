class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int lucky=-1;
        int count=0;
        if(arr.length==1 &&arr[0]==1){
            return 1;
        }
        for(int i=0;i<arr.length;i++){
            if(i==0){
                count=1;
            }
            else if(arr[i]==arr[i-1]){
                count++;
            }
            else if(arr[i]!=arr[i-1]){
                if(count==arr[i-1] && lucky<count){
                    lucky=count;
                }
                count=1;
            }
        }
        // Check the last group
        if(count==arr[arr.length-1] &&lucky<count) {
            lucky=count;
        }
        return lucky;
    }
}
