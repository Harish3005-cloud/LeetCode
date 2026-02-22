class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>merged=new ArrayList<>();
        int [] currInterval=intervals[0];
        merged.add(currInterval);
        for(int nextInterval[] : intervals){
            int currEnd=currInterval[1];
            int nextStart=nextInterval[0];
            int nextEnd=nextInterval[1];
            if(nextStart<=currEnd){
                currInterval[1]=Math.max(currEnd,nextEnd);
            }
            else{
                currInterval=nextInterval;
                merged.add(currInterval);
            }

        }
        return merged.toArray(new int[merged.size()][]);


    }
}