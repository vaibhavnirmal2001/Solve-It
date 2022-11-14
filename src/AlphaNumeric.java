import java.util.*;

public class AlphaNumeric {
    static class alphanumeric {
        public String name;
        public int count;
        alphanumeric(String name, int count) {
            this.name = name;
            this.count = count;
        }
    };
    
    static alphanumeric[] sortedStrings(int N, String[] arr) {
        Map<String, Integer> map = new TreeMap<>();
        for (String e : arr) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }
        alphanumeric[] res = new alphanumeric[map.size()];
        int i = 0;

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            res[i++] = new alphanumeric(e.getKey(), e.getValue());
        }
        return res;
    }

    
    public static void main(String[] args) {
        
    }
}
