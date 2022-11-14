import java.util.*;
public class CogniDistinctYear {

    static int distinct_year(String str) {
        String str2 = "";

        Set<String> uniqueDates = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                str2 += (str.charAt(i));
            }

            // if we found - then clear the str2
            if (str.charAt(i) == '-') {
                str2 = "";
            }

            // if length of str2 becomes 4
            // then store it in a set
            if (str2.length() == 4) {
                uniqueDates.add(str2);
                str2 = "";
            }
        }

        // return the size of set
        return uniqueDates.size();
    }

    // Driver code
    static public void main(String[] args) {
//        String str = "UN was established on 24-10-1945."
//                + "India got freedom on 15-08-1947.";
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
//        System.out.println(str);
        System.out.println(distinct_year(str));
    }
}
