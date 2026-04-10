// Problem 1365: How Many Numbers Are Smaller Than the Current Number

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] bucket = new int[101];

        for (int num : nums) {
            bucket[num]++;
        }

        for (int i = 1; i < 101; i++) {
            bucket[i] += bucket[i - 1];
        }

        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) arr[i] = 0;
            else arr[i] = bucket[nums[i] - 1];
        }

        return arr;
    }
}