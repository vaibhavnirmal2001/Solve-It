import java.util.Arrays;

public class RamanCode {

    public static int sortArr(int[] a, int n){
        Arrays.sort(a);
        return a[n-1];
    }

    public static double intersectionArea(int centerX1, int centerY1, int radius1, int centerX2, int CenterY2, int radius2) {
        // code here
        double Pi = 3.14;
        double d, alpha, beta, a1, a2;
        double answer;
        d = Math.sqrt((centerX2 - centerX1) * (centerX2 - centerX1) + (CenterY2 - centerY1) * (CenterY2 - centerY1));

        if (d > radius1 + radius2) answer = 0;
        else if (d <= Math.abs(radius2 - radius1) && radius1 >= radius2)
            answer = (Pi * radius2 * radius2);

        else if (d <= Math.abs(radius2 - radius1) && radius2 >= radius1)
            answer = (Pi * radius1 * radius1);

        else {
            alpha = Math.acos((radius1 * radius1 + d * d - radius2 * radius2) / (2 * radius1 * d)) * 2;
            beta = Math.acos((radius2 * radius2 + d * d - radius1 * radius1) / (2 * radius2 * d)) * 2;
            a1 = 0.5 * beta * radius2 * radius2 - 0.5 * radius2 * radius2 * Math.sin(beta);
            a2 = 0.5 * alpha * radius1 * radius1 - 0.5 * radius1 * radius1 * Math.sin(alpha);
            answer = (a1 + a2);
        }
        answer= Double.parseDouble(String.format("%4f",answer));
        return answer;

    }

//    public static int countChar(String data, char coder){
//        int answer=0;
//
//        char[] c= data.toCharArray();
//        for (int i = 0; i < c.length; i++) {
//            if (c[i]==coder){
//                answer++;
//            }
//        }
//
//        return answer;
//    }
    public static void main(String[] args) {
        //System.out.println( countChar("haveagoodday",'a'));
        System.out.println(intersectionArea(0,0,2,3,0,2));
        System.out.println(sortArr(new int[]{10,5,7,88,19},3));
    }
}
