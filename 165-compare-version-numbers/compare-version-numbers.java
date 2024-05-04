class Solution {
    public int compareVersion(String version1, String version2) {
        String[] versions1 = version1.split("\\.", 0);
        String[] versions2 = version2.split("\\.", 0);

        int m = versions1.length;
        int n = versions2.length;
        
        for(int i = 0; i < Math.max(m,n); i++){
            int v1 = 0;
            int v2 = 0;
            if(i<m) v1 = Integer.parseInt(versions1[i]);
            if(i<n) v2 = Integer.parseInt(versions2[i]);
            if(v1 - v2 == 0) continue;
            return (v1 - v2 > 0)? 1 : -1;
        }
        return 0;
    }
}