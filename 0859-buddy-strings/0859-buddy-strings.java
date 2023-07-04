class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;

        //if strings are identical we need to check if there is a repeated char to swap
        //so we pass the string to a set. In case there are duplicates, set would be smaller than s
        if (s.equals(goal)) {
            Set<Character> charSet = new HashSet<>();
            for (char c : goal.toCharArray()) {
                charSet.add(c);
            }
            return charSet.size() < s.length();
        }
        //else, if s and goals are different, but same length...
        int firstIndex = -1;
        int secondIndex = -1;

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (firstIndex == -1) {
                    firstIndex = i;
                } else if (secondIndex == -1) {
                    secondIndex = i;
                } else {
                    // We have at least 3 indices with different characters,
                    // thus, we can never make the strings equal with only one swap.
                    return false;
                }
            }
        }
        if (secondIndex == -1) {
            // We can't swap if the character at only one index is different.
            return false;
        }
        // All characters of both strings are the same except two indices.
        return s.charAt(firstIndex) == goal.charAt(secondIndex) &&
                s.charAt(secondIndex) == goal.charAt(firstIndex);
    }
}