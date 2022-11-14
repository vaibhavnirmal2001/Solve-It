public class StepArray {
    public static int search (int a[], int n, int x, int k) {
        int j=1;
        for (int i = 1; i < a.length; i++) {
            if (a[i]==x) return j;
            if (a[i]>=a[i-1]+k) j++;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{4, 5, 6, 7, 6},5,6,1));
    }
}
