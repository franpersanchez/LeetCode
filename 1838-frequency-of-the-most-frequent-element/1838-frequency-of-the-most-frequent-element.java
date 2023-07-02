class Solution {
    public int maxFrequency(int[] nums, int k) {
        //first we sort. Insertion Sort
        int n = nums.length;
        Arrays.sort(nums);
        //now we proceed with the k condition
        //we iterate with sliding window
        int l = 0;
        int r = 0;
        long totalSum = 0;
        int max = 0;
        while (r < n) {
            totalSum = totalSum + nums[r];
            while (nums[r] * (r - l + 1) > totalSum + k) {
                totalSum = totalSum - nums[l];
                l++;
            }
            max = Math.max(max, r - l + 1);
            r++;
        }

        return max;
    }
}