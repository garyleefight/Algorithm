public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int point1 = m-1;
        int point2 = n-1;
        int target = m+n-1;
        while(point1 >= 0 && point2 >= 0){
            if(nums1[point1] > nums2[point2]){
                nums1[target--] = nums1[point1--];
            }else{
                nums1[target--] = nums2[point2--];
            }
        }
        while(point2 >= 0) nums1[target--] = nums2[point2--];
    }
}
// start at front or back is totally different