import java.util.*;
//        answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//        answer[i] == "Fizz" if i is divisible by 3.
//        answer[i] == "Buzz" if i is divisible by 5.
//        answer[i] == i (as a string) if none of the above conditions are true.
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String > al = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i%3==0 && i%5==0) al.add("FizzBuzz");
            else if (i%3==0)  al.add("Fizz");
            else if (i%5==0) al.add("Buzz");
            else al.add(String.valueOf(i));
        }
        return al;
    }
}
