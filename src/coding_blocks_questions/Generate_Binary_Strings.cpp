#include<bits/stdc++.h>
using namespace std;

void f(string input, string output, int idx){
	if(input.length() <= output.length()){
		cout<<output<<" ";
		return;
	}
	while(idx < input.length() && input[idx] != '?'){
		output += input[idx];
		idx++;
	}
	if(input.length() <= output.length()){
		cout<<output<<" ";
		return;
	}
	f(input, output+'0', idx + 1);
	f(input, output+'1', idx + 1);
}

int main() {
	int t;
	cin>>t;
	while(t--){
		string s;
		cin>>s;
		string str = "";
		f(s, str, 0);
		cout<<endl;
	}
	return 0;
}
