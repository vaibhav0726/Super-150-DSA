#include<bits/stdc++.h>
using namespace std;

void solve(vector<string> &ans, string &str, string output, int idx, vector<bool> &isAdded){
	if(output.length() == str.length() && output < str){
		ans.push_back(output);
		return;
	}
	if(output.length() == str.length()) {
		return;
	}

	for(int i=0; i<str.length(); i++){
		if(isAdded[i] == false){
			isAdded[i] = true;
			solve(ans, str, output+	str[i], i+1, isAdded);
			isAdded[i] = false;
		}
	}

}


int main() {
	string str;
	cin>>str;
	vector<string> ans;
	vector<bool> isAdded(str.size());
	fill(isAdded.begin(), isAdded.end(), false);
	solve(ans, str, "", 0, isAdded);
	sort(ans.begin(), ans.end());
	for(int i=0; i<ans.size(); i++){
		cout<<ans[i]<<endl;
	}
	return 0;
}
