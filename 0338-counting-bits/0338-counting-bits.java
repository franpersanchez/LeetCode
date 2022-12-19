class Solution {
    public int[] countBits(int n) {
     int[] ans = new int[n+1];

        for (int i=0; i<ans.length;i++){
            int bits = 0;
            int mask = 1;
            for (int j=0; j<32; j++){
                if ((i & mask) != 0) {
                    bits++;
                }
                mask<<=1;
            }
            ans[i]=bits;
        }
        return ans;
    }
}