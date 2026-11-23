class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res =new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        backtrack(candidates,target,0,curr,res);
        return res;
    }
    public void backtrack(int[]candidates,int rem,int st,List<Integer> curr , List<List<Integer>> res){
        if(rem==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=st;i<candidates.length;i++){
            if(candidates[i]>rem){
                continue;
            }
            curr.add(candidates[i]);
            backtrack(candidates,rem-candidates[i],i,curr,res);
            curr.remove(curr.size()-1);
        }
    }
}