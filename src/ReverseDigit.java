import java.util.Arrays;

public class ReverseDigit {

    static int  isSameReflection(String word1, String word2) {

        int answer=0;
        if (word1.length() != word2.length()) {
            answer =-1;
        } else {

            word1 = word1.concat(word1);


            if (word1.indexOf(word2) != -1)
                answer= 1;
            else
                answer= -1;
        }
        return answer;
    }

    public static int editorMiss(String TextInput){
      int answer=0;
        for (int i = 0; i < TextInput.length(); i++) {

            if (!Character.isDigit(TextInput.charAt(i))
                    && !Character.isLetter(TextInput.charAt(i))
                    && !Character.isWhitespace(TextInput.charAt(i))) {

                answer++;
            }
        }

       return answer;
    }







    public static void main(String[] args) {
        System.out.println(isSameReflection("sample","plesam"));
        System.out.println(editorMiss("aa a234bc@ sad$ hsagd^"));
    }

}
