class Solution {
    public int islandPerimeter(int[][] grid) {
        int p = 0;
        for(int i=0; i< grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if((i==0 && i==grid.length -1)) p+=2*grid[i][j];
                else if(i==0){
                    p+=grid[i][j];
                    p+=~(grid[i+1][j]) & grid[i][j];
                }
                else if(i==grid.length-1){
                    p+=grid[i][j];
                    p+=~(grid[i-1][j]) & grid[i][j];
                }
                else{
                    p+=~(grid[i-1][j]) & grid[i][j];
                    p+=~(grid[i+1][j]) & grid[i][j];
                }
                if(j==0 && j==grid[i].length-1){
                    p+=2*grid[i][j];
                }
                else if(j==0){
                    p+=grid[i][j];
                    p+=~(grid[i][j+1]) & grid[i][j];
                } 
                else if(j==grid[i].length-1){
                    p+=grid[i][j];
                    p+=~(grid[i][j-1]) & grid[i][j];
                }
                else {
                    p+=~(grid[i][j-1]) & grid[i][j];
                    p+=~(grid[i][j+1]) & grid[i][j];
                }
                
            }
        }
        return p;
    }
    
}