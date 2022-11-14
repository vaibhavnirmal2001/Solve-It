import java.util.Arrays;

public class NonRepetingChar {
    public String FirstNonRepeating(String s)
    {
        // code here
        char[] c= s.toCharArray();

        for(int i=0;i<c.length-1;i++){
            if(c[i]==c[i+1]){
                c[i+1]='#';
                break;
            }
        }
        String res= "";
        for(char x: c) res+=x;
        return res;
    }
    public static void main(String[] args) {

    }
}
