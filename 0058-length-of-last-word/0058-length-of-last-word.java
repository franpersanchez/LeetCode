class Solution {
    public int lengthOfLastWord(String s1) {
           // before I get to the last word.
        String s = s1.trim();

        if(s.isEmpty()) {
            return 0; // If the string is empty after removing all the spaces,
            // that means there were no words in the first place.
        }

        //Now we have a clean array. We need to run it from final index to first index and stop in on first blank space
        int count=0;
        for(int i=s.length()-1; i>0; i--){

            if(s.charAt(i)==' '){
                return count;
            }
            count=count+1;
        }
        // If I haven't returned anything yet, that means there were no spaces in the string.
        // That means there was only one word in the whole string
        // and I should just return the length of that one word.
        return s.length();
    }
    
}