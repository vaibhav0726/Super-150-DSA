#include<bits/stdc++.h>
using namespace std;

void solve(vector<int> &v, int idx, int &count, string output, int target){
	if(target == 0){
		count++;
		cout<<output<<" ";
		return;
	}
	for(int i=0; i<v.size(); i++){
		if(v[i] <= target)
			solve(v, i+1, count, output+to_string(v[i]), target-v[i]);
	}
}

int main() {
	int n, m;
	cin>>n>>m;
	vector<int> v;
	for(int i=1; i<=m; i++){
		v.push_back(i);
	}
	int count = 0;
	solve(v, 0, count, "", n);
	cout<<endl<<count;
	return 0;
}
