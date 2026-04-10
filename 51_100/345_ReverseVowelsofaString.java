// Problem 345: Reverse Vowels of a String

class Solution {
    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while(left < right && !isVowel(arr[left])) {
                left++;
            }
            while(left < right && !isVowel(arr[right])) {
                right--;
            }

            char temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;

            left++;
            right--;
        }
        return new String(arr);
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}