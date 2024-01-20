class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i=0; i<magazine.length(); i++){
            map1.put(magazine.charAt(i), map1.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for(int i=0; i<ransomNote.length(); i++){
            map2.put(ransomNote.charAt(i), map2.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }

        Iterator<Character> keys = map2.keySet().iterator();
        while(keys.hasNext()){
            Character key = keys.next();
            int key_num_map1 = map1.getOrDefault(key, 0);
            int key_num_map2 = map2.getOrDefault(key, 0);

            if(key_num_map1 == 0 || key_num_map1 < key_num_map2)
                return false;
        }

        return true;
    }
}
