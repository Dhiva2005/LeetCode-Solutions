// problem 17: Letter Combinations Of A Phone Number

import java.util.*;

class Solution {
    static String[] keypad = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) return res;

        backtrack(digits, 0, "", res);
        return res;
    }

    void backtrack(String digits, int idx, String curr, List<String> res) {
        if (idx == digits.length()) {
            res.add(curr);
            return;
        }

        int digit = digits.charAt(idx) - 48;
        String letters = keypad[digit];

        for (int i = 0; i < letters.length(); i++) {
            backtrack(digits, idx + 1, curr + letters.charAt(i), res);
        }
    }
}

