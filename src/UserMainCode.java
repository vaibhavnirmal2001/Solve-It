import java.util.*;

public class UserMainCode {
    public static boolean isPrime(int n){
        if (n==2||n==3) return true;
        for (int i = 2; i <= n/2 && i!=n; i++) {
            if (n%i==0 ) return false;
        }
        return true;
    }

    public static int ways( int input1) {
        if (input1==0) return 0;
        ArrayList<Integer> al= new ArrayList<>();

        for (int i = 2; i < input1*10; i++) {
            if(isPrime(i)){
                al.add(i);
            }
        }
        int[] candidates = new int[al.size()];
        for (int i = 0; i <al.size() ; i++) {
            candidates[i]=al.get(i);
        }
        input1=candidates[input1-1];
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        combos(0,input1,candidates,ans,new ArrayList<>());

        return ans.size();
    }

    public static void combos(int index , int target , int[] persons , List<List<Integer>> dp , List<Integer> temp)
    {
        if(index == persons.length ){
            if(target == 0){
                dp.add(new ArrayList<>(temp));
            }
            return;
        }

        if(persons[index] <= target){
            temp.add(persons[index]);
            combos(index,target-persons[index],persons,dp,temp);
            temp.remove(temp.size()-1);
        }
        combos(index+1,target,persons,dp,temp);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int[] a = new int[]{2,3,5,7,11,13,19};

        System.out.print(ways(x));

    }
}
