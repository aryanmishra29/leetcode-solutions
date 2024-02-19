class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f = firstOccurence(nums, target, 0, nums.length-1);
        int l = lastOccurence(nums, target, 0, nums.length-1);
        int[] res = {f,l};
        return res;
    }

    public int firstOccurence (int[] arr, int k,int l, int r){
        if(l>r) return -1;
        int m = (l+r)/2;
        if(arr[m]== k){
            if(m==0) return m;
            if(arr[m-1]== k){
                return firstOccurence(arr, k, l, m-1);
            }
            else{
                return m;
            }
        }
        else if(arr[m]>k){
            return firstOccurence(arr, k, l, m-1);
        }
        else{
            return firstOccurence(arr, k, m+1, r);
        }
    }
    public int lastOccurence (int[] arr, int k, int l, int r){
        if(l>r) return -1;
        int m = (l+r)/2;
        if(arr[m]== k){
            if(m==arr.length-1) return m;
            if(arr[m+1]== k){
                return lastOccurence( arr, k, m+1, r);
            }
            else{
                return m;
            }
        }
        else if(arr[m]>k){
            return lastOccurence( arr, k, l, m-1);
        }
        else{
            return lastOccurence( arr, k, m+1, r);
        }
    }
}