import java.util.*;

public class ReverseQueue {
    public Queue<Integer> rev(Queue<Integer> q){
        Stack<Integer> s= new Stack<>();
        while (!q.isEmpty())s.add(q.poll());
        while (!s.isEmpty()) q.add(s.pop());
        return q;
    }
}
