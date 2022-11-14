import java.util.*;
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {

       HashMap<String,List<String>> hm = new HashMap<>();

       for (String s: strs){
           char[] c= s.toCharArray();
           Arrays.sort(c);
           String str= new String(c);
           if (hm.containsKey(str)){
               hm.get(str).add(s);
           }else {
               hm.put(str,new ArrayList<>());
               hm.get(str).add(s);
           }


       }
       return new ArrayList<>(hm.values());
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}
