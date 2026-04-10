//Problem 49: Group Anagrams

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> map = new HashMap<>();

        for(String n: strs){
            char[] arr = n.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(n);
        }
        return new ArrayList<>(map.values());
    }
}