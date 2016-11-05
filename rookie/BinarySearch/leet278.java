/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=1;
        int end=n;
        return find_first(1,n);
    }
    
    public int find_first(int start,int end){
        if(start+1>=end){
            if(isBadVersion(start)){
                return start;
            }else{
                if(isBadVersion(end)){
                    return end;
                }else{
                    return -1;
                }
            }
        }
        
        int mid=end/2+start/2;
        if(isBadVersion(mid)){
            int i=find_first(start,mid-1);
            if(i>0){
                return i;
            }else{
                return mid;
            }
        }else{return find_first(mid+1,end);}
    }
}