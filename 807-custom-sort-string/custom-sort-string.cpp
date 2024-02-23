class Solution {
public:
    string customSortString(string order, string s) {
        vector<pair<char, int>> v;
        auto compare = [](pair<char, int> a, pair<char, int> b) {
            return a.second < b.second;
        };
        for(int i=0; i < s.length(); i++){
            pair<char, int> t;

            if(order.find(s[i]) == string::npos){
                v.push_back(make_pair(s[i], -1));
    
            }
            else {
                v.push_back(make_pair(s[i], order.find(s[i])));

            }
        }
        sort(v.begin(), v.end(), compare);
        string ans="";
        for(int i=0; i<v.size(); i++){
            ans += v[i].first;
        }
        return ans;
        
    }

};