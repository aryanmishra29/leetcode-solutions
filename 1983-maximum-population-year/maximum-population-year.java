class Solution {
    public int maximumPopulation(int[][] logs) {
        int [] years = new int[101];
        for(int i=0; i< logs.length; i++){
            years[logs[i][0]-1950]++;
            years[logs[i][1]-1950]--;
        }
        int ms = years[0];
        int mi = 0;
        int s = years[0];
        for(int i=1; i< 101; i++){
            s += years[i];
            if(s>ms){
                ms = s;
                mi = i;
            }
        }
        return mi + 1950;
    }
}