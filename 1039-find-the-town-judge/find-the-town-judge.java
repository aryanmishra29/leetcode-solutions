class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length == 0 && n>1) return -1;
        for(int j = 1;j<=n;j++){
            boolean c1 = true;
            boolean c2 = true;
            boolean[] t = new boolean[n+1];
            for(int i = 0; i<trust.length; i++){
                if(trust[i][0] == j) c1 = false;
                if(trust[i][1] == j) {
                    t[trust[i][0]] = true;
                }
            }
            for(int i = 1; i<= n; i++){
                if(i!=j && t[i] == false) c2 = false;
            }
            if(c1 && c2) return j;
        }
        return -1;
    }
}