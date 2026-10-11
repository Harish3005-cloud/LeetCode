class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
     Stack<Integer> hst=new Stack<>();
     int n =temperatures.length;
     int res[]=new int[n];
     for(int i=n-1;i>=0;i--){
        while(!hst.isEmpty() && temperatures[i]>=temperatures[hst.peek()]){
            hst.pop();
        }
        if(!hst.isEmpty()){
            res[i]=hst.peek()-i;
        }


        hst.push(i);
     }
     return res;    
    }
}