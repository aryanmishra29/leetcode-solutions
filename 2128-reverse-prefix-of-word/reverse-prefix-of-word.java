class Solution {
    public String reversePrefix(String word, char ch) {
        char [] arr = word.toCharArray();
        int i = 0;
        int j = word.indexOf(ch);
        while(i<=j){
            char t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++; j--;
        }
        return new String(arr);
    }
}