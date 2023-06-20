class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        int windowframe = 2 * k + 1;
        Arrays.fill(ans, -1);

        if (windowframe > n) return ans;

        long[] prefixSum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        for (int i = k; i < n - k; i++){
            ans[i] = (int)(((prefixSum[i+k+1])-prefixSum[i-k])/windowframe);
        }
        return ans;
    }
}