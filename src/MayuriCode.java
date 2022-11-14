import java.util.Arrays;

public class MayuriCode {



    public static String CaserCipher(String str, int num){
        StringBuilder result= new StringBuilder();


        for (int i=0; i<str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                char ch = (char)(((int)str.charAt(i) + num - 65) % 26 + 65);
                result.append(ch);
            }
            else {
                char ch = (char)(((int)str.charAt(i) + num - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result.toString();
    }




    public static void main(String[] args) {
        System.out.println(CaserCipher("Hello",4));
    }
}
