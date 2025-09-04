class Solution {
    public int findClosest(int x, int y, int z) {
        // if((Math.abs(z-y) < Math.abs(z-x))){
        //     return 2;
        // }else if((Math.abs(z-y) > Math.abs(z-x))){
        //     return 1;
        // }else{
        //     return 0;
        // }

        
        //return (Math.abs(z-y) < Math.abs(z-x))?2:((Math.abs(z-y) > Math.abs(z-x))?1:0);
        int dy = Math.abs(z - y);
        int dx = Math.abs(z - x);

        return (dy < dx) ? 2 : ((dy > dx) ? 1 : 0);
        
    }
}