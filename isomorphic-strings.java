class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> charMap = new HashMap<>();
        HashMap<Character, Integer> intMap = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(charMap.containsKey(s.charAt(i))){
                char c = charMap.get(s.charAt(i));
                if(c != t.charAt(i))
                    return false;
                else 
                    continue;
            } 
            else {
                if(intMap.containsKey(t.charAt(i)))
                    return false;
                charMap.put(s.charAt(i), t.charAt(i));
                intMap.put(t.charAt(i), 1);
            }
        }
        return true;
    }
}
