class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        //we need k numbers at both side of the element
        int windowSize = 2 * k + 1;
        //we prefill all elements with -1
        int[] ans = new int[n];
        Arrays.fill(ans,-1);

        if (n < windowSize) {
            return ans;
        }

        long[] prefixSum = new long[n + 1];
        for (int i = 0; i < n; ++i) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        for (int i = k; i + k < n; ++i) {
            ans[i] = (int) ((prefixSum[i + k + 1] - prefixSum[i - k]) / windowSize);
        }

        return ans;
    }
}