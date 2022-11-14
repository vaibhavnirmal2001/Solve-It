import java.util.*;
public class ReverseLevelOrderTraversal {
    public ArrayList<Integer> reverseLevelOrder(Node node){
        ArrayList<Integer> al = new ArrayList<>();
        Queue<Node> q= new LinkedList<>();
        q.add(node);
        while (!q.isEmpty()){
            Node curr=q.poll();
            al.add(curr.data);

            if (curr.right!=null) q.add(curr.right);
            if (curr.left!=null) q.add(curr.left);
        }
        Collections.reverse(al);
        return al;
    }
}
