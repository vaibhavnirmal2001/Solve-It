import java.util.Arrays;

public class EquationEquality {
        static int[] uf = new int[26];
        public static boolean equationsPossible(String[] equations) {
            for (int i = 0; i < 26; ++i) uf[i] = i;
            for (String e : equations)
                if (e.charAt(1) == '=')
                    uf[find(e.charAt(0) - 'a')] = find(e.charAt(3) - 'a');
            for (String e : equations)
                if (e.charAt(1) == '!' && find(e.charAt(0) - 'a') == find(e.charAt(3) - 'a'))
                    return false;
            return true;
        }

        public static int find(int x) {
            if (x != uf[x]) uf[x] = find(uf[x]);
            return uf[x];
        }

    public static void main(String[] args) {
        System.out.println(equationsPossible(new String[]{"b==a","a==b"}));

    }
}
