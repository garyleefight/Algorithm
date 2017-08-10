/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new ArrayList<>();
        if(intervals == null || intervals.size() == 0) return res;
        Collections.sort(intervals,new Comparator<Interval>(){
            @Override
            public int compare(Interval i1,Interval i2){
                return i1.start - i2.start;
            }
            
        });
        
        Interval temp = intervals.get(0);
        for(int i=0;i<intervals.size();i++){
            if(intervals.get(i).start > temp.end){
                Interval new_i = new Interval(temp.start,temp.end);
                res.add(new_i);
                temp = intervals.get(i);
            }else{
                Interval new_i;
                if(temp.end < intervals.get(i).end){
                new_i = new Interval(temp.start,intervals.get(i).end);}
                else{ 
                new_i = new Interval(temp.start,temp.end);}
                temp = new_i;
            }
        }
        res.add(temp);
        return res;
    }
}