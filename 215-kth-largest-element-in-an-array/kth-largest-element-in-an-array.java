class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(Integer x: nums ){
            pq.add(x);

            if(pq.size()>k){
                pq.poll();
            }

        }
        return pq.peek();
    }
}