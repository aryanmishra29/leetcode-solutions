class Solution {
    public int findPeakElement(int[] nums) {
        return peak(nums, 0, nums.length-1);
    }
    public int peak(int[] arr, int l, int r){
        if(l>r) return -1;
        int mid = (l+r)/2;
        if(l == 0 && r == 0) return 0;
        if(mid == 0){
            if(arr[mid]>arr[mid+1]) {
                return mid;
            }
            else {
                return peak(arr, mid+1, r);
            }
        }  
        if(mid == arr.length - 1){
            if(arr[mid]>arr[mid-1]) {
              
                return mid;
            }
            else{
               
                return peak(arr, l, mid-1);
            } 
        }  
        if(arr[mid]>arr[mid+1] && arr[mid]> arr[mid-1]){
            return mid;
        }
        else if(arr[mid] >= arr[mid+1]){
            return peak(arr, l, mid-1);
        }
        else if(arr[mid] >= arr[mid-1]){
            return peak(arr, mid+1, r);
        }
        else{
            return peak(arr, mid+1, r);
        }
    }
}