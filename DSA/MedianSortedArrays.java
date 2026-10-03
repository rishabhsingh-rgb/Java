class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] nums3=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        for(int q=0;q<m+n;q++){
            if(i<n &&j<m && nums1[i]<=nums2[j]){
                nums3[k]=nums1[i];
                i++;
                k++;
            }
            else if(j<m && i<n && nums1[i]>nums2[j]){
                nums3[k]=nums2[j];
                j++;
                k++;
            }
            else if(j<m &&  i>=n){
                nums3[k]=nums2[j];
                j++;
                k++;
            }
            else{
                nums3[k]=nums1[i];
                i++;
                k++;
            }
        }
        if((m+n)%2!=0){
            return (double)nums3[(m+n-1)/2];
        }
        else{
            return (double)(nums3[(m+n)/2]+nums3[(m+n)/2 -1])/2;
        }
    }
}
