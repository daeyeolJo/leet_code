class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int answer = 0;
        int i = 0;
        while(i < s.length()){
            char c = s.charAt(i);
            if(c == 'I' && i + 1 != s.length()){
                char nextChar = s.charAt(i+1);
                if(nextChar == 'V'){
                    answer += 4;
                    i = i + 2;
                    continue;
                }
                if(nextChar == 'X'){
                    answer += 9;
                    i = i + 2;
                    continue;
                }
            }
            if(c == 'X' && i + 1 != s.length()){
                char nextChar = s.charAt(i+1);
                if(nextChar == 'L'){
                    answer += 40;
                    i = i + 2;
                    continue;
                }
                if(nextChar == 'C'){
                    answer += 90;
                    i = i + 2;
                    continue;
                }
            }
            if(c == 'C' && i + 1 != s.length()){
                char nextChar = s.charAt(i+1);
                if(nextChar == 'D'){
                    answer += 400;
                    i = i + 2;
                    continue;
                }
                if(nextChar == 'M'){
                    answer += 900;
                    i = i + 2;
                    continue;
                }
            }
            answer += map.get(c);
            i++;
        }
        return answer;
    }
}
