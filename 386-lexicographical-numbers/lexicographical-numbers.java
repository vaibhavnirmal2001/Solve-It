class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<10;i++){
            search(i, n, res);
        }
        return res;
    }
    
    public void search(int curr, int n, List<Integer> res){
        if(curr>n) return;
        else{
            res.add(curr);
        for(int i=0;i<10;++i){
            if((10*curr) + i >n) return;

            search(10*curr+i, n, res);
        }
        }
        
    }
}

