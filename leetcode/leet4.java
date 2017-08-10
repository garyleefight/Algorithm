public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        if((length + 1) % 2 == 0) return (double)findtarget(nums1,nums2,0,0,(length + 1)/2);
        else return (findtarget(nums1,nums2,0,0,(length+1)/2)
                + findtarget(nums1,nums2,0,0,(length+1)/2 + 1)) / 2.0;
    }

    private int findtarget(int[] nums1,int[] nums2,int index1,int index2,int rem){
        if(index1 >= nums1.length) return nums2[rem + index2 - 1];
        if(index2 >= nums2.length) return nums1[rem + index1 - 1];

        if(rem == 1) return Math.min(nums1[index1],nums2[index2]);

        int del = rem/2;
        if(nums1.length - index1 < del) return findtarget(nums1,nums2,index1,index2 + del,rem - del);
        if(nums2.length - index2 < del) return findtarget(nums1,nums2,index1 + del,index2,rem - del);

        if(nums1[index1 + del - 1] >= nums2[index2 + del - 1]) return findtarget(nums1,nums2,index1,index2 + del,rem - del);
        else return findtarget(nums1,nums2,index1 + del,index2,rem-del);
    }
}