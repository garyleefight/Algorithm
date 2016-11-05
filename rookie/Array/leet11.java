public class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int max=0;
        int temp=0;
        if(end==0){
            return 0;
        }
        
        while(start<end){
            if(height[start]>height[end]){
                temp=(end-start)*height[end];
                end--;
            }else{
                temp=(end-start)*height[start];
                start++;
            }
            if(temp>max){
                max=temp;
            }
        }
        return max;
    }
}