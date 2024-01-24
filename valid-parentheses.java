class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            Character curr = s.charAt(i);
            if(!stack.isEmpty()){
                Character top = stack.peek();
                if((curr == ')' && top == '(') || (curr == ']' && top == '[') || (curr == '}' && top == '{')){
                    stack.pop();
                } else {
                    stack.push(curr);
                }
            } else {
                stack.push(curr);
            }
        }
        if(!stack.isEmpty())
            return false;
        else
            return true;
    }
}
