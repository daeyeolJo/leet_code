class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArr = s.split(" ");
        if(pattern.length() != strArr.length)
            return false;
        HashMap<Character, String> map = new HashMap<>();

        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            if(map.containsKey(c)){
                if(!map.get(c).equals(strArr[i]))
                    return false;
                else
                    continue;
            } else {
                if(map.containsValue(strArr[i]))
                    return false;
                map.put(c, strArr[i]);
            }
        }
        return true;
    }
}
