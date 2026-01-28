package HashTable.GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a hashmap
        HashMap<String, List<String>> map = new HashMap<>();
        // Go through each value in the string array
        for(int i = 0; i < strs.length; i++) {
            // Sort the string
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String s = new String(charArray);

            // If the map contains the sorted string, add the unsorted string to the list 
            if(map.containsKey(s)) {
                map.get(s).add(strs[i]);
            }
            // If not add the sorted string to the map as a key and the value is a list containing this string
            else {
                map.put(s, new ArrayList<String>(Arrays.asList(strs[i])));
            }
        }

        // Make a list with the final one
        List<List<String>> finalList = new ArrayList<>();
        List<String> keySet = new ArrayList<>(map.keySet());

        // Go through each key and add the value to the final list, leaving us with a list of lists
        for(int i = 0; i < keySet.size(); i++) {
            finalList.add(map.get(keySet.get(i)));
        }

        // Return the final list
        return finalList;
    }
}