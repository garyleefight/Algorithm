public class Solution {
    public int minCost(int[][] costs) {
        if(costs == null || costs.length == 0) return 0;
        int[][] max = new int[costs.length][costs[0].length];
        max[0][0] = costs[0][0];
        max[0][1] = costs[0][1];
        max[0][2] = costs[0][2];
        for(int i=1;i<costs.length;i++){
            for(int j=0;j<costs[0].length;j++){
                int temp = 0;
                switch(j){
                    case 0:
                        temp = Math.min(max[i-1][1],max[i-1][2]);
                        break;
                    case 1:
                        temp = Math.min(max[i-1][0],max[i-1][2]);
                        break;
                    case 2:
                        temp = Math.min(max[i-1][0],max[i-1][1]);
                        break;
                    default:
                        break;
                }
                max[i][j] = temp + costs[i][j];
            }
        }
        return Math.min(max[costs.length-1][2],Math.min(max[costs.length-1][0],max[costs.length-1][1]));
    }
}