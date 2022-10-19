class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        PriorityQueue<String> pq = new PriorityQueue<>((a,b)->(map.get(a)==map.get(b))? b.compareTo(a) : map.get(a).compareTo(map.get(b)));

        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i])){
                map.put(words[i], map.get(words[i])+1);
            } else {
                map.put(words[i], 1);
            }
        }

        for(String a: map.keySet()){
            pq.add(a);

            if(pq.size()>k){
                String temp = pq.remove();
                
            }
        }   

        List<String> list = new ArrayList<>();

        while(pq.size()>0){
            String temp = pq.remove();
            list.add(0,temp);
        }
        return list;
    }
}
