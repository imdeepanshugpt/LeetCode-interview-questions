package PartitionLabels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> mergedLengths = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, i);
        }
        int max = 0;
        int prev = -1;
        System.out.println(map);
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            max = Math.max(max, map.get(ch));
            System.out.println(max + " and "+ ch);
            if(max == i){
                // partition time
                mergedLengths.add(max - prev);
                prev = max;
            }
        }
        return mergedLengths;
    }

    public static void main(String args[]){
        Solution s = new Solution();
        s.partitionLabels("ababcbacadefegdehijhklij");
    }
}
