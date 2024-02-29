class Solution {
    public int largestRectangleArea(int[] heights) {    
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> s = new Stack<>();
        for (int i=0; i<n; i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]) s.pop();
            if(s.isEmpty()) left[i] = -1;
            else left[i] = s.peek();
            s.push(i);
        }
        s.clear();
        for(int i=n-1; i>=0; i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]) s.pop();
            if(s.isEmpty()) right[i] = n;
            else right[i] = s.peek();
            s.push(i);
        }
        int ans = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            int w = (i - left[i]) + (right[i] - i) - 1;
            int h = heights[i];
            ans = Math.max(ans, w*h);
        }

        return ans;
    }
}