class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int maxarea = 0;
        for(int i=0;i<=n;i++){
            int currheight = (i==n)?0:heights[i];
            while(!st.isEmpty() && currheight < heights[st.peek()]){
                int height = heights[st.pop()];
                int width = (st.isEmpty())?i:i-st.peek()-1;
                int ar = height * width;
                maxarea=Math.max(maxarea,ar);
            }
            st.push(i);       
            
            }
            return maxarea;
    }
}