public class IshikaNCDEX {


    public  int lcm(int input1, int input2) {
        int max,step,lcm=0;
        if(input1 > input2){
            max = step = input1;
        }
        else{
            max = step = input2;
        }

        while(input1!= 0) {
            if(max % input1 == 0 && max % input2 == 0) {
                lcm = max;
                break;
            }
            max += step;
        }
        return lcm;
    }





    public static void main(String[] args) {
        //System.out.println(lcm(2,3));

    }
}
