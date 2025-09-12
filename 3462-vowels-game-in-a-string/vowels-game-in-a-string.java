class Solution {
    public boolean doesAliceWin(String s) {
        int vowelCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) vowelCount++;
        }
        if (vowelCount == 0) return false;
        if (vowelCount % 2 != 0) return true;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count++;
                if (count == vowelCount) {
                    if (i + 1 < s.length() && isVowel(s.charAt(i + 1))) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }

        return true;
    }

    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
