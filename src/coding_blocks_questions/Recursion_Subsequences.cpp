#include<bits/stdc++.h>
using namespace std;

void subSequence(string input, string output, int idx, int &outcome){
	if(idx >= input.length()){
		cout<<output<<" ";
		outcome++;
		return;
	}
	char ch = input[idx];
	subSequence(input, output, idx+1, outcome);
	subSequence(input, output+ch, idx+1, outcome);
}

int main() {
	string s;
	cin>>s;
	int outcome = 0;
	subSequence(s, "", 0, outcome);
	cout<<endl<<outcome<<endl;
	return 0;
}
