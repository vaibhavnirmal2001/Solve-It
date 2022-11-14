public class PairDifference {
    public static boolean findPair(int arr[], int size, int n)
    {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(Math.abs(arr[i]-arr[j])==n) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(findPair(new int[]{5, 20, 3, 2, 5, 80},1,78));
    }
}
