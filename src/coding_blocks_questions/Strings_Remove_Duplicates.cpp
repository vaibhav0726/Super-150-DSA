#include<bits/stdc++.h>
using namespace std;

int main() {
	string s;
	cin>>s;
	string new_string;
	new_string+=s[0];
	char ch = s[0];
	for(int i=1; i<s.length(); i++){
		if(ch == s[i]){
			continue;
		}
		else{
			new_string+=s[i];
			ch = s[i];
		}
	}
	cout<<new_string;
	return 0;
}
