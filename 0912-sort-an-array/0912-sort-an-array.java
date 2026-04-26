class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums);
        return nums;
    
    }
      public void merge(int b[],int c[],int[]nums){
            int p=b.length;
            int q=c.length;
            int i=0,j=0,k=0;
            while(i<p && j<q){
                if(b[i]<=c[j]){
                    nums[k++]=b[i++];
                }
                else{
                    nums[k++]=c[j++];
                }
            }
            System.arraycopy(b,i,nums,k,p-i);
            System.arraycopy(c,j,nums,k+(p-i),q-j);
        }
        public void mergesort(int [] nums){
            if(nums.length<2) return;
            int b[]=new int[nums.length/2];
            int c[]=new int[nums.length-nums.length/2];
            System.arraycopy(nums,0,b,0,b.length);
            System.arraycopy(nums,b.length,c,0,c.length);
            mergesort(b);
            mergesort(c);
            merge(b,c,nums);    
        }
}
