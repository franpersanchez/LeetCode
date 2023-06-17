class Solution {
    public int reverse(int x) {
        int reversed = 0;
        int n = 0;
        if (x == 0) return 0;
        while (x != 0) {
            n = x % 10;
            x = x / 10;
            if (reversed > Integer.MAX_VALUE / 10 || reversed == Integer.MAX_VALUE / 10 && n > 7) return 0;
            if (reversed < Integer.MIN_VALUE / 10 || reversed == Integer.MIN_VALUE / 10 && n < -8) return 0;
            reversed = (reversed * 10) + n;
        }
        return reversed;
    }
}