class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int ans[] = new int[n1+n2];

        int i=0;
        int j=0;
        int k=0;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                ans[k++]=nums1[i++];
            }else{
                ans[k++]=nums2[j++];
            }
        }

        if(i<n1){
            while(i<n1){
                ans[k++]=nums1[i++];
            }
        }
        if(j<n2){
            while(j<n2){
                ans[k++]=nums2[j++];
            }
        }

        if((n1+n2)%2!=0) return (double) ans[(n1+n2)/2];
        else{
            int a = (n1+n2)/2;
            int b = a-1;
            double x = ans[a];
            double y = ans[b];
            return (x+y)/2;
        }
    }
}