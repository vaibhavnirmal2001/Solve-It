class Solution {
    public String removeDuplicates(String s) {
       Deque<Character> dq = new ArrayDeque<>();
        for(Character x: s.toCharArray()){
            if (!dq.isEmpty() && dq.peekLast()==x){
                dq.pollLast();
            }else {
                dq.offer(x);
            }
        }
        StringBuilder sb= new StringBuilder();
        for(Character x:  dq){
            sb.append(x);
        }
        return sb.toString();  
    }
}