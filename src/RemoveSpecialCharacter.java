public class RemoveSpecialCharacter {

    public static void main(String[] args) {
        String s= "skjdng#$k^@@dfnbsr@^&*(fkgns";
        String ans=  s.replaceAll("[^a-zA-Z1-9]","_");
        System.out.println(ans);
    }

}
