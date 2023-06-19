class Solution {
    public int myAtoi(String s) {
     //string length
        final int len = s.length();
        //if the string have no size or it is null, return 0
        if (len == 0 || s == null) {
            return 0;
        }
        //we start the index at 0
        int index = 0;

        // skipping all white spaces from the beginning
        while (index < len && s.charAt(index) == ' ') {
            ++index;
        }

        boolean isNegative = false;

        // to handle sign cases
        if (index < len) {
            if (s.charAt(index) == '-') {
                isNegative = true;
                ++index;
            } else if (s.charAt(index) == '+') {
                ++index;
            }
        }
        int result = 0;
        // converting digit(in character form) to integer form
        // iterate until non-digit character is not found or we can say iterate till found character is a digit
        while (index < len && isDigit(s.charAt(index))) {

      /* s.charAt(index) - '0' is to convert the char digit into int digit eg: '5' - '0' --> 5
      or else it will store the ASCII value of 5 i.e. 53,
      so we do 53(ASCII of 5) - 48(ASCII of 0(zero)) to get 5 as int*/
            int digit = s.charAt(index) - '0';

            // to avoid integer overflow
            if (result > (Integer.MAX_VALUE / 10) || (result == (Integer.MAX_VALUE / 10) && digit > 7)) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            // adding digits at their desired place-value
            result = (result * 10) + digit;

            ++index;
        }

        return isNegative ? -result : result;
    }

    private boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }

}