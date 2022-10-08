#include<bits/stdc++.h>
using namespace std;

void print(string &s, int start){
	if(start == s.length()){
		return;
	}
	if(s[start] == 'p'){
		if(start+1 != s.length() && s[start+1] == 'i'){
			s = s.substr(0, start) + "3.14" + s.substr(start + 2, s.length());
			start = start + 2;
		}
		else start = start + 1;
	}
	else{
		start = start + 1;
	}
	print(s, start);
}

int main() {
	int t;
	cin>>t;
	while(t--){
		string s;
		cin>>s;
		print(s, 0);
		cout<<s<<endl;
	}
	return 0;
}
