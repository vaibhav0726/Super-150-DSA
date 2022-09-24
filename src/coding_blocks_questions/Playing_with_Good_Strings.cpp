#include<bits/stdc++.h>
using namespace std;

int main() {
	string s;
	cin>>s;
	int count=0, m=0;
	for(int i=0; i<s.length(); i++){
		if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u'){
			count++;
		}
		else{
			m = max(m, count);
			count=0;
		}
	}
	m = max(m, count);
	cout<<m;
	return 0;
}
