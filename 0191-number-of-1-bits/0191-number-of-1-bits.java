public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int bits = 0;
        int mask = 1;

        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                bits++;
            }
//in each iteration, you shift the 1 to the left with <<
            mask <<= 1;
        }
        return bits;
    }
}