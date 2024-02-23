class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=-1,j=nums.length;
        for(int k=0; k<nums.length; k++){
            if(nums[k] >= 0) {
                i=k;
                break;
            }
            else j = k;
        }
        int [] ans = new int[nums.length];
        int m = 0;
        while(i<nums.length && j>=0 && i>=0 && j<nums.length){
		    if(Math.pow(nums[i],2) < Math.pow(nums[j],2)){
		        ans[m++] = (int)Math.pow(nums[i++],2);
		    }
		    else{
		        ans[m++] = (int)Math.pow(nums[j--],2);
		    }
		}
		while(i<nums.length && i>=0){
		    ans[m++] = (int)Math.pow(nums[i++],2);
		}
		while(j>=0 && j<nums.length){
		    ans[m++] = (int)Math.pow(nums[j--],2);
		}

        return ans;


    }
}