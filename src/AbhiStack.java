import java.util.ArrayList;
import java.util.Iterator;

public class AbhiStack {

    public int climbStairs(int n) {
        if(n==0||n==1) return 1;
        int stepOne=1,stepTwo=1;
        int result=0;

        for(int i=2;i<=n;i++){
            result=stepOne+stepTwo;
            stepTwo=stepOne;
            stepOne=result;
        }

        return result;
    }



    public static void main(String[] args) {
        String s="dog cat cat dog";
        char[] c=  s.toCharArray();
        ArrayList<String > al = new ArrayList<>();

        for (int i = 0; i < c.length; i++) {
           String str= "";
           while (c[i] != ' '){
               str+=c[i];
               i++;
               if (i>=s.length()) break;
           }
           al.add(str);

        }
        Iterator<String> it = al.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+ " ");
        }

    }
}
