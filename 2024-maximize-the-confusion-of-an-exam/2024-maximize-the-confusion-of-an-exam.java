class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        // sliding window problem
        int sumT = 0;
        int sumF = 0;
        int windowLeft = 0;
        int ansT = 0;
        int ansF = 0;
        for (int i = 0; i < answerKey.length(); i++) {
            if (answerKey.charAt(i) == 'T') {
                sumT = sumT + 'T';
            }

            while (('T' * (i - windowLeft + 1)) > (k * 'T' + sumT)) {
                sumT = sumT - (answerKey.charAt(windowLeft) == 'T' ? 'T' : 0);
                windowLeft++;
            }
            ansT = Math.max(ansT, i - windowLeft + 1);

        }
        windowLeft=0;
        for (int i = 0; i < answerKey.length(); i++) {
            if (answerKey.charAt(i) == 'F') {
                sumF = sumF + 'F';
            }

            while (('F' * (i - windowLeft + 1)) > (k * 'F' + sumF)) {
                sumF = sumF - (answerKey.charAt(windowLeft) == 'F' ? 'F' : 0);
                windowLeft++;
            }
            ansF = Math.max(ansF, i - windowLeft + 1);

        }
        return ansT=Math.max(ansF,ansT);
    }
}