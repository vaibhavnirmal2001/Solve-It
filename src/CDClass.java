import java.util.*;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'batonPass' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER friends
     *  2. LONG_INTEGER time
     */



}
public class CDClass {
//    public static List<Integer> buttonPass(int friend, long time){
//        ArrayList<Integer> al = new ArrayList<>();
//        ArrayList<Integer> al2 = new ArrayList<>();
//        ArrayList<Integer> ans = new ArrayList<>();
//
//
//
//            for (int i = 1; i <= friend; i++) {
//                al.add(i);
//            }
//            for (int i = friend - 1; i >= 1; i--) {
//                al.add(i);
//            }
//
//
//        for (int k = 0; k < 5;k++) {
//            for (int i = 2; i <= friend; i++) {
//                al.add(i);
//            }
//            for (int i = friend - 1; i >= 1; i--) {
//                al.add(i);
//            }
//        }
//
//
//
//        ans.add(al.get((int) time-1));
//        ans.add(al.get((int) (time)));
//        return ans;
//    }

    public static List<Integer> batonPass(int friend, long time) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();



        for (int i = 1; i <= friend; i++) {
            al.add(i);
        }
        for (int i = friend - 1; i >= 1; i--) {
            al.add(i);
        }


        for (int k = 0; k < 5;k++) {
            for (int i = 2; i <= friend; i++) {
                al.add(i);
            }
            for (int i = friend - 1; i >= 1; i--) {
                al.add(i);
            }
        }



        ans.add(al.get((int) time-1));
        ans.add(al.get((int) (time)));
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(batonPass(3,6));
        //1 2 3 4 5
    }
}
