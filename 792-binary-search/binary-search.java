class Solution {
    public int search(int[] nums, int target) {
        return bSearch(nums, target, 0, nums.length-1);
    }
    public int bSearch(int[] arr, int k, int l, int r){
        if(l>r) return -1;
        int m = (l + r)/2;
        if(arr[m] == k) {
            return m;
        }
        else if(arr[m] > k){
            return bSearch(arr, k, l, m-1);
        }
        else{
            return bSearch(arr, k, m+1, r);
        }
    }
}