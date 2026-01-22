package HashTable.IsometricStrings;

import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Build a map for each direction of the relationship between characters
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        // Iterate over each character of each string, s.length() == t.length(), so i < s.length() is sufficient
        for(int i = 0; i < s.length(); i++) {
            // Variables to hold the current char from each string
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // Check if sMap contains the current character from that string already
            // If it does, it's asssociated value must be the current char from t
            if(sMap.containsKey(c1) && sMap.get(c1) != c2) return false;

            // Check if tMap contains the current character from that string already
            // If it does, it's associated value must be from the current char from s
            if(tMap.containsKey(c2) && tMap.get(c2) != c1) return false;

            // If neither of those conditions are met, put the relationship into the maps
            sMap.put(c1, c2);
            tMap.put(c2, c1);
        }

        // Return true if that condition never fails
        return true;
    }
}