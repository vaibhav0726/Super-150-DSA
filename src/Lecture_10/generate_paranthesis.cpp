class Solution {
private:
    void para(vector<string> &v, int n, int open, int close, string output){
        if(open == n && close == n){
            cout<<output<<endl;
            v.push_back(output);
            return;
        }
        if(open < n)
            para(v, n, open+1, close, output+"(");
        if(close < open)
            para(v, n, open, close+1, output+")");
    }
public:
    vector<string> generateParenthesis(int n) {
        vector<string> v;
        para(v, n, 0, 0, "");
        return v;
    }
};