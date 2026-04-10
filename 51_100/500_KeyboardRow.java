// Problem 500: Keyboard Row

import java.util.*;

class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String w = word.toLowerCase();

            if (canType(w, row1) || canType(w, row2) || canType(w, row3)) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    private boolean canType(String word, String row) {
        for (char c : word.toCharArray()) {
            if (row.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}