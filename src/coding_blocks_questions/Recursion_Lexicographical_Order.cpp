#include<bits/stdc++.h>
using namespace std;

void solve(vector<int> &ans, int i, int n){
	if(i > n) return;
	ans.push_back(i);
	solve(ans, i*10, n);
	if(i % 10 != 9)
		solve(ans, i+1, n);
}

int main() {
	int n;
	cin>>n;
	vector<int> ans;
	solve(ans, 1, n);
	cout<<0<<" ";
	for(int i=0; i<ans.size(); i++){
		cout<<ans[i]<<" ";
	}
	return 0;
}
