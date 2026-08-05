class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    int n=nums.length;
    HashMap<Integer,Integer> map = new HashMap<>();
    Arrays.sort(nums);
    for(int num:nums){
        if(!map.containsKey(num)){
            map.put(num,0);
        }
        map.put(num,map.getOrDefault(num,0)+1);
    }
    List<Integer>[] bucket= new ArrayList[n+1];
    for(int key:map.keySet()){
        int freq=map.get(key);
        if(bucket[freq]==null){
            bucket[freq]=new ArrayList<>();
        }
        bucket[freq].add(key);
    }
    int res[]=new int[k];
    int idx=0;
    for(int i=bucket.length-1;i>=0 && idx<k;i--){
        if(bucket[i]!=null){
            for(int num:bucket[i]){
                res[idx++]=num;
                if(idx==k) {
                    break;
                }
            }
        }
    }
       return res;
    }
 
}