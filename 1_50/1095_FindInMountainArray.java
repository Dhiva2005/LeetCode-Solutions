// Problem 1095: Find in Mountain Array

/**
 * interface MountainArray {
 *     public int get(int index);
 *     public int length();
 * }
 */

class Solution {

    public int findInMountainArray(int target, MountainArray arr) {
        int n = arr.length();
        int peak = findPeak(arr, n);

        int idx = binarySearch(arr, target, 0, peak, true);
        if (idx != -1) return idx;

        return binarySearch(arr, target, peak + 1, n - 1, false);
    }

    private int findPeak(MountainArray arr, int n) {
        int left = 0, right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) < arr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private int binarySearch(MountainArray arr, int target, int left, int right, boolean ascending) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int val = arr.get(mid);

            if (val == target) return mid;

            if (ascending) {
                if (val < target) left = mid + 1;
                else right = mid - 1;
            } else {
                if (val < target) right = mid - 1;
                else left = mid + 1;
            }
        }
        return -1;
    }
}