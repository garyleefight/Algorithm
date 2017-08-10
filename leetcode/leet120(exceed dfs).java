public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> input = new ArrayList();
        int min = Integer.MAX_VALUE;
        return dfs(triangle,input,0,min,0,0);
    }
    
    private int dfs(List<List<Integer>> triangle,List<Integer> input,int sum,int min,int layer,int index){
        if(input.size() == triangle.size()){
            return sum<min?sum:min;
        }
        
        int start = layer;
        List<Integer> temp = triangle.get(layer);
        if(index<temp.size()){
        input.add(temp.get(index));
        sum += input.get(input.size()-1);   
        }else{
            return min;
        }
        min = Math.min(dfs(triangle,input,sum,min,layer+1,index),dfs(triangle,input,sum,min,layer+1,index+1));
        input.remove(input.size() -1);
        return min;
    }
}