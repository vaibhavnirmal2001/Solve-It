class Solution {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int sum=0;
        for(int i=0;i<points.length-1;i++){
            sum+=Math.max(Math.abs((points[i+1][0]-points[i][0])),Math.abs((points[i+1][1]-points[i][1])));
        }
        return sum;
    }
}