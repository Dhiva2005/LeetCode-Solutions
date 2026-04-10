// Problem 977: Square Of a Sorted Array

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int left = 0;
        int right = n-1;
        int position = n-1;

        while(left<=right){
            int leftsq = nums[left]*nums[left];
            int rightsq = nums[right]*nums[right];

            if(leftsq>rightsq){
                arr[position] = leftsq;
                left++;
            }
            else{
                arr[position] = rightsq;
                right--;
            }
            position--;
        }
        return arr;
    }
}