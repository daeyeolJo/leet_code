class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<strs.length; i++){
            min = Math.min(min, strs[i].length());
        }

        String res = "";
        outerLoop:
        for(int i=0; i<min; i++){
            char c = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++){
                if(c != strs[j].charAt(i))
                    break outerLoop;
            }
            res += c;
        }

        return res;
    }
}
