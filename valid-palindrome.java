class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        int sLen = s.length();
        for(int i=0; i<sLen/2; i++){
            if(s.charAt(i) != s.charAt(sLen - i - 1)){
                return false;
            }
        }
        return true;
    }
}
