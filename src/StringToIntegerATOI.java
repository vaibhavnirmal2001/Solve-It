public class StringToIntegerATOI {
    public static int myAtoi(String s) {
        String res=s.replaceAll("[^0-9]","");
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i)=='-') return -(Integer.parseInt(res));
        }

        return Integer.parseInt(res);
    }

    public static int atoi(String s) {
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i)=='-' && s.charAt(i+1)!='-') continue;
            if (!Character.isDigit(s.charAt(i)))return -1;
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("--4193"));
    }
}
