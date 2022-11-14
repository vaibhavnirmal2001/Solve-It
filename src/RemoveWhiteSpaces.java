public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str="fdnv jsjdfns   nlsdf  fjd sdflivsd fn  n n        kjdfnnsfenvwpsaenfjvns  jsfdn ";
//        StringBuilder ans= new StringBuilder();
//        for (Character c:str.toCharArray()) if (Character.isAlphabetic(c)) ans.append(c);


//        String ans= str.trim(); //leading and trailing spaces removed

        String ans= str.replaceAll("\\s","");
        System.out.println(ans);

    }
}
