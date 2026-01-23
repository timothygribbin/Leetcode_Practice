import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        // If they are not the same length, they cannot contain the same letters
        if(s.length() != t.length()) return false;

        // Make a HashMap
        HashMap<Character, Integer> map = new HashMap<>();

        
        // Build the map with s and it's number of occurrences
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Go through the same map with t
        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            // If the map does not contain the key, then they are not anagrams
            if(!map.containsKey(c)) return false;

            // Change the input to - 1 if it does contain the key, think of this as marking it off as matching with s
            map.put(c, map.get(c) - 1);

            // If you have marked off all occurrences, then remove it
            if(map.get(c) == 0) {
                map.remove(c);
            }
        }

        // Return if the map is empty or not
        return map.isEmpty();
    }
}
