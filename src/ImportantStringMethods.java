import java.util.Arrays;

public class ImportantStringMethods {
    public static void main(String[] args) {
        String s= "   this is    my name : Vaibhav   ";
        String g=s.replaceAll("^[a-zA-Z]","");
        String[] d=s.trim().replaceAll(" +"," ").split(" ");
        System.out.println(Arrays.toString(d));
        System.out.println(g);
    }
}
