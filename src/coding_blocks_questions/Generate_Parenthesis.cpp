#include<bits/stdc++.h>
using namespace std;

void solve(vector<string> &v, int open, int close, int n, string ans){
	if(ans.length() == 2*n){
		v.push_back(ans);
		return;
	}
	if(open<n){
		solve(v, open+1, close, n, ans+'(');
	}
	if(close<open){
		solve(v, open, close+1, n, ans+')');
	}
	
}

int main() {
	int n;
	cin>>n;
	vector<string> v;
	solve(v, 0, 0, n, "");
	for(int i=v.size()-1; i>=0; i--){
		cout<<v[i]<<endl;
	}
	return 0;
}
