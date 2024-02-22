class Solution {
public:
    vector<vector<int>> kClosest(vector<vector<int>>& points, int k) {
        sort(points.begin(),points.end(), compare);
        vector<vector<int>> ans;
        for(int i = 0; i< k; i++){
            ans.push_back(points[i]);
        }
        return ans;
    }

    static bool compare(vector<int> a, vector<int> b){
        float x = sqrt(a[0]*a[0] + a[1]*a[1]);
        float y = sqrt(b[0]*b[0] + b[1]*b[1]);
        return x<y;
    }

    
};