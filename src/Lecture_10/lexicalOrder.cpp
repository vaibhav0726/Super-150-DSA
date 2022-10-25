class Solution {
private:
    void sol(vector<int> &v, int n, int ans){
        if(ans > n) return;
        if(ans!=0)
            v.push_back(ans);
        int i=0;
        if(ans == 0) i = 1;
        for(; i<=9; i++){
            sol(v, n, ans*10+i);
        }
    }
public:
    vector<int> lexicalOrder(int n) {
        vector<int> v;
        sol(v, n, 0);
        return v;
    }

};