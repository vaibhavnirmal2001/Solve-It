class Solution {
    public int findClosest(int x, int y, int z) {
        if((Math.abs(z-y) < Math.abs(z-x))){
            return 2;
        }else if((Math.abs(z-y) > Math.abs(z-x))){
            return 1;
        }else{
            return 0;
        }

        
        // return (Math.abs(z-y < z-x) && Math.abs(z-y != z-x))? 2:1;
        
        
    }
}