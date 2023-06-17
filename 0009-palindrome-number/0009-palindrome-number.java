class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        //first we reverse the number
        int n = 0;
        int reversed = 0;
        int originalNum = x;
        while (x != 0) {
            n = x % 10;
            x = x / 10;
            if (reversed > Integer.MAX_VALUE || reversed == Integer.MAX_VALUE && n > 7) return false;
            if (reversed < Integer.MIN_VALUE || reversed == Integer.MIN_VALUE && n < -8) return false;
            reversed = (reversed * 10) + n;
        }
        if ((originalNum ^ reversed ^ 1) != 1) return false;
        return true;
    }
}