package HashTable.WordsInARow;

import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public String[] findWords(String[] words) {

        // Build HashSets for each row
        HashSet<Character> r1 = toSet("qwertyuiop");
        HashSet<Character> r2 = toSet("asdfghjkl");
        HashSet<Character> r3 = toSet("zxcvbnm");
    
        // List that will hold valid strings in the end
        ArrayList<String> list = new ArrayList<>();
        
        // For every word
        for(String word : words) {
            // Will turn to true if a letter is not in the same row as the others
            boolean flag = false;
            // Set the word to lower case
            String s = word.toLowerCase();

            // The first letter will be our reference point, the row it is in, the others must be in, or it does not pass
            HashSet<Character> row = r1.contains(s.charAt(0)) ? r1 : r2.contains(s.charAt (0)) ? r2 : r3;

            // For every letter in the string (god I wish Java made string iterable)
            for(int i = 0; i < s.length(); i++) {

                // If the row we found above does not contain the character in s, set the flag to true and break immediately, it
                // does not fit the criteria
                if(!row.contains(s.charAt(i))) {
                    flag = true; 
                    break;
                }
            }

            // If the flag is still false after each character, add the word to the list
            if(flag == false) list.add(word);
        }

        // return the list as a String array
        return list.toArray(new String[0]);
    }
    
    // Helper method to build the sets
    public HashSet<Character> toSet(String s) {
        // Build a set
        HashSet<Character> set = new HashSet<>();

        // Add each character to the set (Java gods, I am once again asking you to make String iterable)
        for(int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        // Return the built set
        return set;
    }
}