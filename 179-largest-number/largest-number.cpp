class Solution {
public:
    string largestNumber(vector<int>& nums) {
        sort(nums.begin(), nums.end(), compare);
        string ans = "";
        for(int i=0; i<nums.size(); i++){
            ans+=to_string(nums[i]);
        }
        bool x = false;
        for(int i = 0; i < ans.length(); i++){
            if(ans[i]!='0') x = true;
        }
        return x?ans:"0";
    }
    static bool compare (int a, int b){
        string s1 = "";
        string s2 = "" ;
        s1+=to_string(a);
        s2+=to_string(b);
        return s1+s2 > s2+s1;
    }
};