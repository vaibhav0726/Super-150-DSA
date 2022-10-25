#include<bits/stdc++.h>
using namespace std;

void solve(vector<string> &v, vector<string> &ans, int &count, string output, string digit, int idx){
	if(idx >= digit.size()){
		count++;
		ans.push_back(output);
		return;
	}

	int number = digit[idx] - '0';
	string value = v[number];
	for(int i=0; i<value.length(); i++){
		solve(v, ans, count, output+value[i], digit, idx+1);
	}
}

int main() {
	string str; cin>>str;
	int count = 0;
	vector<string> ans;
	vector<string> v = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz"};
	solve(v, ans, count, "", str, 0);
	for(int i=0; i<ans.size(); i++){
		cout<<ans[i]<<" ";
	}
	cout<<endl<<count;
	return 0;
}
