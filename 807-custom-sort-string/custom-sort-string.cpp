class Solution {
public:
    string customSortString(string order, string s) {
        vector<pair<char, int>> v;
        for(int i=0; i < s.length(); i++){
            pair<char, int> t;
            cout<<order.find(s[i])<<endl;
            if(order.find(s[i]) == string::npos){
                v.push_back(make_pair(s[i], -1));
                cout<<"i"<<endl;
            }
            else {
                v.push_back(make_pair(s[i], order.find(s[i])));
                cout<<"e"<<endl;
            }
        }
        sort(v.begin(), v.end(), compare);
        string ans="";
        for(int i=0; i<v.size(); i++){
            ans += v[i].first;
        }
        return ans;
    }
    static bool compare (pair<char, int> a, pair<char, int> b){
    
        return a.second < b.second;
    }
};