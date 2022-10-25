#include<bits/stdc++.h>
using namespace std;

bool f = false;

void display(vector<vector<int>> &ans, int n, int m){
	for(int i=0; i<n; i++){
		for(int j=0; j<m; j++){
			cout<<ans[i][j]<<" ";
		}
		cout<<endl;
	}
}

void solve(vector<vector<int>> &ans, vector<string> &v, int cr, int cc, int n, int m){
	if(f == false){
		if(cr == n - 1 && cc == m - 1 && v[cr][cc] != 'X'){
			ans[cr][cc] = 1;
			f = true;
			display(ans, n, m);
			return;
		}
		if(cr>=n || cc>=m || ans[cr][cc] == 1 || v[cr][cc] == 'X'){
			return;
		}

		ans[cr][cc] = 1;
		solve(ans, v, cr, cc+1, n, m);
		solve(ans, v, cr+1, cc, n, m);
		ans[cr][cc] = 0;
	}
}

int main() {
	int n, m; 
	cin>>n>>m;
	string temp;
	vector<string> v;
	vector<vector<int>> ans(n, vector<int>(m, 0));
	for(int i=0; i<n; i++){
		cin>>temp;
		v.push_back(temp);
	}
	solve(ans, v, 0, 0, n, m);
	if(!f) cout<<-1;
	return 0;
}
