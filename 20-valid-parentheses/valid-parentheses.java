class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }else if(!stack.isEmpty()){
                if(c==')' && stack.peek()!='('){
                    return false;
                }else if(c==']' && stack.peek()!='['){
                    return false;
                }else if(c=='}' && stack.peek()!='{'){
                    return false;
                }else{
                    stack.pop();
                }
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}