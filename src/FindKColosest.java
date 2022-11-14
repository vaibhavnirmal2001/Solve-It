
import java.util.*;

public class FindKColosest {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int low = 0;
        int high = arr.length - 1;
        List<Integer> result = new ArrayList<>(k);

        while (high - low >= k) {
            if (Math.abs(arr[low] - x) > Math.abs(arr[high] - x)) {
                low++;
            } else {
                high--;
            }
        }
        for (int i = low; i <= high; i++) {
            result.add(arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
