class Solution {
public:
    vector<int> advantageCount(vector<int>& nums1, vector<int>& nums2) {
        sort(nums1.begin(), nums1.end());
        vector<pair<int,int>> p;
        for(int i=0; i<nums2.size(); i++){
            p.push_back(make_pair(nums2[i], i));
        }
        sort(p.begin(), p.end(), [](pair<int, int> a, pair<int, int> b){
            return a.first<b.first;
        });
        int n = nums1.size();
        vector<int> ans(n);

        int l=0,r = n-1;
        for(int i=0;i<n;i++){
            if(nums1[i]> p[l].first){
                ans[p[l++].second] = nums1[i];
            }
            else{
                ans[p[r--].second] = nums1[i];
            }
        }
        
        return ans;

    }
    
};