#include<bits/stdc++.h>
using namespace std;

void solve(vector<string> &ans, int cr, int cc, string str, int &n, int &m, int &count){

	if(cr == n-1 && cc == m-1){
		ans.push_back(str);
		count++;
		return;
	}

	if(cr>=n || cc>=m){
		return;
	}
	//vertical
	solve(ans, cr+1, cc, str+'V', n, m, count);
	//horizontal
	solve(ans, cr, cc+1, str+'H', n, m, count);	
	// south-east
	solve(ans, cr+1, cc+1, str+'D', n, m, count);	
}

int main() {
	int m,n;
	cin>>n>>m;
	vector<string> ans;
	int count = 0;
	string str ="";
	solve(ans, 0, 0, str, n, m, count);
	for(int i=0; i<ans.size(); i++){
		cout<<ans[i]<<" ";
	}
	cout<<endl<<count;
	return 0;
}
