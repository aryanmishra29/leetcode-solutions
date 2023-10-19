class Solution {
    public int uniquePaths(int m, int n) {
        long dist = 1;
        for (int i = 1; i <= m - 1; i++) {
            dist = dist * (n - 1 + i) / i;
        }
        return (int)dist;
    }

}