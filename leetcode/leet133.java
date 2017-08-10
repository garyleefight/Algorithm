/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();
        HashMap<UndirectedGraphNode,Boolean> visit = new HashMap<>();
        if(node == null) return null;
        dfs(node,visit,map);
        return map.get(node);
    }
    
    private void dfs(UndirectedGraphNode node, HashMap<UndirectedGraphNode,Boolean> visit, HashMap<UndirectedGraphNode,UndirectedGraphNode> map){
        
        visit.put(node,true);
        
        UndirectedGraphNode copy = null;
        if(map.containsKey(node)){
            copy = map.get(node);
        }else{
            copy = new UndirectedGraphNode(node.label);
            map.put(node,copy);
        }

        //visit all neighbors
        for(UndirectedGraphNode current: node.neighbors){
            UndirectedGraphNode copy_c = null;
            if(map.containsKey(current)){
                copy_c = map.get(current);
            }else{
                copy_c = new UndirectedGraphNode(current.label);
                map.put(current,copy_c);
            }
            copy.neighbors.add(copy_c);
            if(visit.containsKey(current) && visit.get(current)) continue;
            else{
                dfs(current,visit,map);
            }
        }
        
    }
}