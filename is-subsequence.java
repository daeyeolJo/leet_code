class Solution {
    public boolean isSubsequence(String s, String t) {
        int prev_idx = -1;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            boolean exists = false;
            for(int j=prev_idx+1; j<t.length(); j++){
                if(c == t.charAt(j)){
                    prev_idx = j;
                    exists = true;
                    break;
                }
            }
            if(!exists){
                return false;
            }
        }
        return true;
    }
}
