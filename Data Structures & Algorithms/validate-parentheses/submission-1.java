class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put(')','(');
        pairs.put(']','[');
        pairs.put('}','{');
        for(int i = 0; i<s.length(); i++){
            if(pairs.containsKey(s.charAt(i))){
                if(!stack.isEmpty() && pairs.get(s.charAt(i)) == stack.peek()){
                    stack.pop();
                } else {
                    return false;
                }     
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}


