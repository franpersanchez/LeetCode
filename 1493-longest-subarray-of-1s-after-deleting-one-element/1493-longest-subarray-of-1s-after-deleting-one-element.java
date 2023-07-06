class Solution {
    public int longestSubarray(int[] nums) {
        int zeroCount = 0;
        int largestWindow = 0;
        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            zeroCount = zeroCount + (nums[i] == 0 ? 1 : 0);

            while (zeroCount > 1) {
                zeroCount = zeroCount - (nums[start] == 0 ? 1 : 0);
                start++;
            }
            largestWindow=Math.max(largestWindow, i-start);
        }
        return largestWindow;
    }
}