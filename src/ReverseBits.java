

public class ReverseBits {

    public static int reverseBits(int n) {
        if (n == 0) return 0;


        String s= String.valueOf(n);

        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i >=0 ; i--) {
            sb.append(s.charAt(i));
        }


        return Integer.parseInt(sb.toString(),2);

    }
    public static void main(String[] args) {
        System.out.println(reverseBits(011100));

    }
}
