import java.util.ArrayList;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean isFound=false;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i)==s.charAt(j) &&i!=j){
                    isFound=true;
                    break;
                }
            }
            if (!isFound) return i;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
