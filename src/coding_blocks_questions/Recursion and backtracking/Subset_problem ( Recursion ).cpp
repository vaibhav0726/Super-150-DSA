#include<bits/stdc++.h>
using namespace std;

void solve(vector<int> &v, int idx, int &count, string output, int target){
	if(target == 0){
		count++;
		cout<<output<<" ";
		return;
	}
	for(int i=idx; i<v.size(); i++){
		if(v[i] <= target)
			solve(v, i+1, count, output+to_string(v[i])+" ", target-v[i]);
	}
}

int main() {
	int n;
	cin>>n;
	vector<int> v;
	int temp;
	for(int i=0; i<n; i++){
		cin>>temp;
		v.push_back(temp);
	}
	int target;
	cin>>target;
	int count = 0;
	solve(v, 0, count, "", target);
	cout<<endl<<count;
	return 0;
}
