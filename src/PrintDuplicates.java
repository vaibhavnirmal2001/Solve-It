import java.util.*;

public class PrintDuplicates {
    public static Map<Character,Integer> printDups(String s){
        HashMap<Character,Integer> al = new HashMap<>();
        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (hs.contains(s.charAt(i))){
                al.put(s.charAt(i),al.getOrDefault(s.charAt(i),0)+1);
                continue;
            }else {
                hs.add(s.charAt(i));
                al.put(s.charAt(i),al.getOrDefault(s.charAt(i),0)+1);


            }
        }
        return al;
    }


    public static void main(String[] args) {
        System.out.println(printDups("test string"));
    }
}
