public class AsciiPrint {

    public static int titleToNumber(String s) {
        if (s == null) return -1;
        int sum = 0;

        for (char c : s.toUpperCase().toCharArray()) {
            sum *= 26;
            sum += c - 'A' + 1;
        }
        return sum;
    }
    public static void main(String[] args) {
/*
        for (int i = 0; i <= 127; i++) {
            System.out.printf("%d = %c",i,i);
            System.out.println();
        }
*/

        System.out.println(titleToNumber("ABC"));
    }
}
