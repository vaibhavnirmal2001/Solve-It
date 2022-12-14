class Solution {
    public static int maxArea(int[] a) {
        if (a.length==0) return 0;
        int area=0, left=0, right=a.length-1, max=0;

        while (left<right){
            int width=right-left;

            area=width*(Math.min(a[left],a[right]));
            if (area>max) max=area;

            if (a[left]<a[right]) left++;
            else if (a[right]<a[left]) right--;
            else {
                left++;
                right--;
            }
        }
        return max;
    }
}