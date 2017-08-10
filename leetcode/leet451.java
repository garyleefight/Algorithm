package com.lsr.algo;

import java.util.*;

public class Solution {

    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int max = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
            max = Math.max(max,map.get(c));
        }
        List<Character> [] bucket = new List[max + 1];
        for(Character c:map.keySet()){
            int value = map.get(c);
            if(bucket[value] == null) bucket[value] = new ArrayList<>();

            for(int i=0;i<map.get(c);i++){
                bucket[value].add(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=bucket.length - 1;i>=1;i--){
            if(bucket[i] != null){
                for(Character c: bucket[i]) sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        solution.frequencySort("tree");
    }
}



