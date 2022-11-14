
import java.util.*;
import java.lang.*;
import java.io.*;
public class CodeCheif {



        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc =  new Scanner(System.in);
            int t= sc.nextInt();

            //2⋅a+2⋅b+a⋅b=X

            while (t-->0){
                int x= sc.nextInt();
                boolean flag= false;
                for (int i = 1; i <=x && !flag; i++) {
                    for (int j = i ; j <=x && !flag; j++) {
                        if (2 * i + 2 * j + i * j == x) {
                            flag = true;
                            break;
                        }
                    }
                }
                if (flag) System.out.println("YES");
                else System.out.println("NO");
        }
    }

}
