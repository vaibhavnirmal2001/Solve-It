class Solution {
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') ||(c=='}' && top != '{')) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}